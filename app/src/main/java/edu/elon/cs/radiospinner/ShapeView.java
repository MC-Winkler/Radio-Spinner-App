package edu.elon.cs.radiospinner;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by mwinkler3 on 9/20/2015.
 */


public class ShapeView extends View {

    private ArrayList<MyShape> theShapes;
    private String currentShape;
    private String currentColor;

    public ShapeView (Context context, AttributeSet attrs){
        super(context, attrs);
        theShapes = new ArrayList<MyShape>();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            theShapes.add(new MyShape(event.getX(), event.getY(), currentColor, currentShape));
        }
        return true;
    }

    @Override
    protected void onDraw (Canvas canvas){

        for (MyShape shape : theShapes){
            shape.draw(canvas);
        }
        invalidate();
    }

    public void setCurrentShape (String shape){
        currentShape = shape;
    }

    public String getCurrentShape () {
        return currentShape;
    }

    public void setCurrentColor (String color){
        currentColor = color;
    }

    public String getCurrentColor () {
        return currentColor;
    }
}
