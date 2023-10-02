package com.example.ads;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adView = findViewById(R.id.adView);

        //Step 1

        MobileAds.initialize(this);

        //Step 2
        AdRequest adRequest = new AdRequest.Builder().build();

        //step 3
        adView.loadAd(adRequest);




    }
}