package com.example.parth.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = (CardView) findViewById(R.id.cardView);

        /*
        cardView.setRadius(20.0f);
        cardView.setCardElevation(11.0f);
        cardView.setUseCompatPadding(true);
        */
    }
}
