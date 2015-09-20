package edu.elon.cs.radiospinner;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by mwinkler3 on 9/20/2015.
 */
public class MyShape {

    private float x,y;
    private final int PENWIDTH = 50;
    private Paint paint;
    private String currentShape;

    public MyShape(float x, float y, String color, String currentShape){
        this.x = x;
        this.y =y;
        this.currentShape= currentShape;
        paint = new Paint();
        //System.out.println("color");

        if (color.equals("Red")){
            paint.setARGB(255, 255, 0, 0);
        }
        else if (color.equals("Green")){
            paint.setARGB(255,0,255,0);
        }
        else if (color.equals("Blue")){
            paint.setARGB(255,0,0,255);
        }
    }

    public void draw (Canvas canvas) {
        if (currentShape.equals("Circle")){
            canvas.drawCircle(x,y, PENWIDTH, paint);
        }
        else if (currentShape.equals("Square")){
            canvas.drawRect((x-(PENWIDTH)), (y-(PENWIDTH)), (x+(PENWIDTH)), (y+(PENWIDTH)), paint);
        }
    }
}
