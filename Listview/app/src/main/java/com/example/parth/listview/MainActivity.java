package com.example.parth.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.layout.simple_list_item_1;

public class MainActivity extends AppCompatActivity {

    ListView lstView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstView = (ListView) findViewById(R.id.list_item);

        ArrayList<String> city = new ArrayList<>();
        city.add("Google");
        city.add("Gmail");
        city.add("Yahoo");
        city.add("Google Ads");
        city.add("Microsoft");
        city.add("Facebook");
        city.add("Tata");
        city.add("Reliance");
        city.add("L & T");
        city.add("Bata");
        city.add("Adani");
        city.add("Samsung");
        city.add("Nokia");
        city.add("LG");
        city.add("Mahindra & Mahindra");
        city.add("Sony");
        city.add("Micromax");
        city.add("Vivo");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,city);
        lstView.setAdapter(adapter);

        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Click item position First: ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
