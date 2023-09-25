package com.example.parth.datapassinginfragment;


import android.support.v4.app.Fragment;
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

        loadFragment(new AFragment());

        btnFragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(AFragment.getInstance("RAM",11));
            }
        });

        btnFragB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new BFragment());
            }
        });
        btnFragC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new CFragment());
            }
        });
    }
    public void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        /*Bundle bundle = new Bundle();
        bundle.putString("ARG1","Hanuman Dada");
        bundle.putInt("ARG2",55);

        fragment.setArguments(bundle);*/

        ft.add(R.id.container,fragment);
        ft.commit();
    }
}
