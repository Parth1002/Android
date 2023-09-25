package com.example.parth.toolsbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolBar);

        //Step 1
        setSupportActionBar(toolbar);

        //Step 2
        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
           // getSupportActionBar().setTitle("My ToolsBar");
        }

        toolbar.setTitle("My ToolBar");
        toolbar.setSubtitle("Sub Title");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        if (itemId==R.id.opt_new){
            Toast.makeText(this, "New File", Toast.LENGTH_SHORT).show();
        }else if (itemId==R.id.opt_open){
            Toast.makeText(this, "Open File", Toast.LENGTH_SHORT).show();
        }else if (itemId==R.id.opt_Save){
            Toast.makeText(this, "Save File", Toast.LENGTH_SHORT).show();
        }else if (itemId==R.id.home){
            super.onBackPressed();
        }else {
            Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
