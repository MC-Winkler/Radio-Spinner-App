package edu.elon.cs.radiospinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Spinner;

/*
 * Created by Michael Winkler
 * 9/20/2015.
 */

public class MainActivity extends Activity {

    private ShapeView shapeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shapeView = (ShapeView) findViewById(R.id.theView);
        Spinner spinner = (Spinner) findViewById (R.id.spinner);
        shapeView.setSpinner(spinner);
        RadioButton circleRadio = (RadioButton) findViewById(R.id.circle_radio);
        circleRadio.setChecked(true);
        shapeView.setCurrentShape("Circle");
        shapeView.setCurrentColor("Red");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onCircleClick (View view) {
        //When the radio button labeled "circle" is touched
        shapeView.setCurrentShape("Circle");
    }

    public void onSquareClick (View view) {
        //When the radio button labeled "square" is touched
        shapeView.setCurrentShape("Square");
    }

}
