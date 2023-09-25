package com.example.parth.backstackfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.support.v4.app.FragmentManager.POP_BACK_STACK_INCLUSIVE;

public class MainActivity extends AppCompatActivity {

    Button btnFragA,btnFragB,btnFragC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragA = (Button) findViewById(R.id.BtnFragA);
        btnFragB = (Button) findViewById(R.id.BtnFragB);
        btnFragC = (Button) findViewById(R.id.BtnFragC);

        loadFragment(new AFragment(),0);

        btnFragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new AFragment(),0);
            }
        });

        btnFragB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new BFragment(),1);
            }
        });
        btnFragC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new CFragment(),1);
            }
        });
    }
    public void loadFragment(Fragment fragment,int flag) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (flag==0){
            ft.add(R.id.container,fragment);
            fm.popBackStack(ROOT_FRAGMENT_TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            ft.addToBackStack(ROOT_FRAGMENT_TAG);
        }else {
            ft.replace(R.id.container,fragment);
            ft.addToBackStack(null);
        }

        ft.commit();
    }
}
