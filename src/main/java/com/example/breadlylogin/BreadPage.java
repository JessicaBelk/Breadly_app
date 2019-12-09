package com.example.breadlylogin;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;


public class BreadPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breadpage);
        TextView Bread = findViewById(R.id.breadmatch);
        Button BP_button = findViewById(R.id.BPbutton);
        Button Map = findViewById(R.id.mapbtn);
        Bread.setText("You are Chabatta Bread!");
        BP_button.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent = new Intent(v.getContext(), QuizPage.class);
                        startActivity(myIntent);
                    }
                }
        );
        Map.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent = new Intent(v.getContext(), MapsActivity.class);
                        startActivity(myIntent);
                    }
                }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_breadpage, menu);
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
}