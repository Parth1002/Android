package com.example.parth.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerContanct);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<ContactModel> arrContacts = new ArrayList<>();
        /* ContactModel model = new ContactModel(R.drawable.A,"A","00000000"); */
        arrContacts.add(new ContactModel(R.drawable.a,"A","000000000"));
        arrContacts.add(new ContactModel(R.drawable.a,"B","111111111"));
        arrContacts.add(new ContactModel(R.drawable.a,"C","222222222"));
        arrContacts.add(new ContactModel(R.drawable.a,"D","333333333"));
        arrContacts.add(new ContactModel(R.drawable.a,"E","444444444"));
        arrContacts.add(new ContactModel(R.drawable.a,"F","555555555"));
        arrContacts.add(new ContactModel(R.drawable.a,"G","666666666"));
        arrContacts.add(new ContactModel(R.drawable.a,"H","777777777"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);


    }
}
