package com.example.parth.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFragA,btnFragB,btnFragC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragA = (Button) findViewById(R.id.BtnFragA);
        btnFragB = (Button) findViewById(R.id.BtnFragB);
        btnFragC = (Button) findViewById(R.id.BtnFragC);

        btnFragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                // AFragment aFragment = new AFragment();

                ft.add(R.id.container,new AFragment());
                ft.commit();

            }
        });

        btnFragB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                // BFragment bFragment = new BFragment();

                ft.add(R.id.container,new BFragment());
                ft.commit();
            }
        });

        btnFragC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                // CFragment cFragment = new CFragment();

                ft.add(R.id.container,new CFragment());
                ft.commit();
            }
        });
    }
}
