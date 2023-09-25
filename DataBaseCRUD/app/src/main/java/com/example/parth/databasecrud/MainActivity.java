package com.example.parth.databasecrud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.parth.databasecrud.data.MyDBHelper;
import com.example.parth.databasecrud.model.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDBHelper db = new MyDBHelper(MainActivity.this);

        /*
        // Creating a contact object for the db
        Contact databse = new Contact();
        databse.setPhoneNumber("9090909090");
        databse.setName("Ram");
        // Adding a contact to the db
        db.addContact(databse);
        // Creating a contact object for the db



        // Creating a contact object for the db
        Contact Krishna = new Contact();
        Krishna.setPhoneNumber("9090459090");
        Krishna.setName("Krishna");
        // Adding a contact to the db
        db.addContact(Krishna);
        // Creating a contact object for the db


        // Creating a contact object for the db
        Contact tehri = new Contact();
        tehri.setPhoneNumber("9090675409");
        tehri.setName("Tehri");
        // Adding a contact to the db
        db.addContact(tehri);
        Log.d("Parth", "Id for tehri and larry are successfully added to the db");



        // Update
        // Contact tehri = new Contact();
        tehri.setId(6);
        tehri.setName("Changed Hanuman Dada");
        tehri.setPhoneNumber("0000000000");
        int affectedRows = db.updateContact(tehri);

        Log.d("Parth", "No of affected rows are: " + affectedRows);
        // Update
        */

        /* Delete */
             db.deleteContact(9);
        /* Delete */

        // Select
        // Get all contacts
        List<Contact> allContacts = db.getAllContacts();
        for (Contact contact : allContacts) {
            Log.d("Parth", "\nId: " + contact.getId() + "\n" + "Name: " + contact.getName() + "\n" + "Phone Number: " + contact.getPhoneNumber() + "\n");
        }
        // Select
    }
}