package com.example.parth.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnView = (BottomNavigationView) findViewById(R.id.bnView);

        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id==R.id.nav_home){
                    loadFrag(new AFragment(),false);
                }else if (id==R.id.nav_search){
                    loadFrag(new BFragment(),false);
                }else if (id==R.id.nav_Utilities){
                    loadFrag(new CFragment(),false);
                }else if (id==R.id.nav_contact){
                    loadFrag(new DFragment(),false);
                }else {
                    loadFrag(new EFragment(),true);
                }
                return false;
            }
        });

        bnView.setSelectedItemId(R.id.nav_profile);
    }

    public void loadFrag(Fragment fragment,boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (flag) {
            ft.add(R.id.container, fragment);
        }else {
            ft.replace(R.id.container, fragment);
        }
        ft.commit();
    }
}
