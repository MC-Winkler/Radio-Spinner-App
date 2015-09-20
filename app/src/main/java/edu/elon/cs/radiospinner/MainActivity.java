package edu.elon.cs.radiospinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Spinner;


public class MainActivity extends Activity {

    private ShapeView shapeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shapeView = (ShapeView) findViewById(R.id.theView);
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
        shapeView.setCurrentShape("Circle");
    }

    public void onSquareClick (View view) {
        shapeView.setCurrentShape("Square");
    }

    public void onSetColor (View view) {
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        shapeView.setCurrentColor(String.valueOf(spinner.getSelectedItem()));
        System.out.println(String.valueOf(spinner.getSelectedItem()));
    }
}
