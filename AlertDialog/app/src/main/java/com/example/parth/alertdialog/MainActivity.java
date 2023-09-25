package com.example.parth.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Single Dialog Box
        /*
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();

            alertDialog.setTitle("Terms & Condtions");
            alertDialog.setMessage("Have You Read T & C");

            alertDialog.setButton("Yes I've Read", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "Your Process Now...", Toast.LENGTH_SHORT).show();
                }
            });
            alertDialog.show();
        */

        // Double Dialog Box

            AlertDialog.Builder delDialog = new AlertDialog.Builder(MainActivity.this);

            delDialog.setTitle("Delete");
            delDialog.setMessage("You are sure Delete ?");
            delDialog.setIcon(R.drawable.ic_delete_black_24dp);

            delDialog.setPositiveButton("Yes ", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "Item Deleted..", Toast.LENGTH_SHORT).show();
                }
            });

            delDialog.setNegativeButton("No ", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "Item Not Deleted..", Toast.LENGTH_SHORT).show();
                }
            });
            delDialog.show();
    }
        // Threeple Dialog Box
        @Override
        public void onBackPressed() {
            AlertDialog.Builder exitDialog = new AlertDialog.Builder(MainActivity.this);

            exitDialog.setTitle("Exit");
            exitDialog.setMessage("You Exit Sure.");
            exitDialog.setIcon(R.drawable.ic_exit_to_app_black_24dp);

            exitDialog.setPositiveButton("No ", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "Wel-Come Back..", Toast.LENGTH_SHORT).show();
                }
            });

            exitDialog.setNegativeButton("Yes ", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    MainActivity.super.onBackPressed();
                }
            });
            exitDialog.show();
        }
}
