package com.example.parth.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner txtView;
    AutoCompleteTextView edittxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView = (Spinner) findViewById(R.id.txtview);
        edittxt = (AutoCompleteTextView) findViewById(R.id.edittxt);

        // Spinner
        ArrayList<String> arrDoc = new ArrayList<>();
        arrDoc.add("Aadhar Card");
        arrDoc.add("Pan Card");
        arrDoc.add("Election Card");
        arrDoc.add("Debit Card");
        arrDoc.add("Credit Card");
        arrDoc.add("Sharm Card");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,arrDoc);
        txtView.setAdapter(adapter);

        // AutoCompleteTextView
        ArrayList<String> arrLang = new ArrayList<>();
        arrLang.add("C");
        arrLang.add("C++");
        arrLang.add("Java");
        arrLang.add("PHP");
        arrLang.add("Javascript");
        arrLang.add("C#");
        arrLang.add("CSharp");
        arrLang.add("SQL");
        arrLang.add("GO");
        arrLang.add("HTML");
        arrLang.add("CSS");
        arrLang.add("XML");
        arrLang.add("Noda JS");
        arrLang.add("VB.NET");
        arrLang.add("Android");

        ArrayAdapter<String> adapterLang = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrLang);
        edittxt.setAdapter(adapterLang);
        edittxt.setThreshold(1);

    }
}
