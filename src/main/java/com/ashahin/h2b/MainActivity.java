package com.ashahin.h2b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView day2,day3,day4,day5,day6,day7,day8,day9,day10;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        //define cars herer
        day2=(CardView) findViewById(R.id.card2Id);
        day3=(CardView) findViewById(R.id.card3Id);
        day4=(CardView) findViewById(R.id.card4Id);
        day5=(CardView) findViewById(R.id.card5Id);
        day6=(CardView) findViewById(R.id.card6Id);
        day7=(CardView) findViewById(R.id.card7Id);
        day8=(CardView) findViewById(R.id.card8Id);
        day9=(CardView) findViewById(R.id.card9Id);
        day10=(CardView) findViewById(R.id.card10Id);



        ////ends of defining cardview


        //add clickListener for all cardview

        day2.setOnClickListener(this);
        day3.setOnClickListener(this);
        day4.setOnClickListener(this);
        day5.setOnClickListener(this);
        day6.setOnClickListener(this);
        day7.setOnClickListener(this);
        day8.setOnClickListener(this);
        day9.setOnClickListener(this);
        day10.setOnClickListener(this);

        // end of adding clicklistener


    }  //end of onCreate function

/////backpressed method

    @Override
    public void onBackPressed()
    {
        finish();
        super.onBackPressed();

    }
// onclick listener method implements here


    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {

            case R.id.card2Id:
                i = new Intent(this, Day2.class);
                startActivity(i);
                break;
            case R.id.card3Id:
                i = new Intent(this, Day3.class);
                startActivity(i);
                break;
            case R.id.card4Id:
                i = new Intent(this, Day4.class);
                startActivity(i);
                break;
            case R.id.card5Id:
                i = new Intent(this, Day5.class);
                startActivity(i);
                break;
            case R.id.card6Id:
                i = new Intent(this, Day6.class);
                startActivity(i);
                break;
            case R.id.card7Id:
                i = new Intent(this, Day7.class);
                startActivity(i);
                break;
            case R.id.card8Id:
                i = new Intent(this, Day8.class);
                startActivity(i);
                break;
            case R.id.card9Id:
                i = new Intent(this, Day9.class);
                startActivity(i);
                break;
            case R.id.card10Id:
                i = new Intent(this, Day10.class);
                startActivity(i);
                break;
            default:
                break;


        }
    }

}
