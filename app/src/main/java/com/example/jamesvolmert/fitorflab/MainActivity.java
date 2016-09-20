package com.example.jamesvolmert.fitorflab;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    public static final String EXERCISE_WEIGHTS = "Weight Lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightBtn = (RelativeLayout) findViewById(R.id.weightBtn);
        RelativeLayout yogaBtn = (RelativeLayout) findViewById(R.id.yogaBtn);
        RelativeLayout heartBtn = (RelativeLayout) findViewById(R.id.heart);


        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);
            }
        });


        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_YOGA);
            }
        });

        heartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_CARDIO);
            }
        });
    }  // end of on create

    // function for knowing which view got selected

    private void loadDetailActivity(String exerciseTitle) {

    }

}  // end of class
