package com.example.breadlylogin;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class QuizPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizpage);

        Button QP_button = findViewById(R.id.QPbutton);
        Button Start_btn = findViewById(R.id.startbtn);

        QP_button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view) {
                        Intent myIntent = new Intent(view.getContext(), BreadPage.class);
                        startActivity(myIntent);
                    }
                }
        );

        Start_btn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), QuestionOne.class);
                startActivity(myIntent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quizpage, menu);
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