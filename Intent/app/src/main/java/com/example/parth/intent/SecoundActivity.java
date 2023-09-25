package com.example.parth.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecoundActivity extends AppCompatActivity {


    TextView txtStudentinfo;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);

        /* Set Data */
        Intent fromAct = getIntent();
        String title = fromAct.getStringExtra("title");
        String studentName = fromAct.getStringExtra("StudentName");
        int rollNo = fromAct.getIntExtra("Roll No",0);
        /* Set Data */

        txtStudentinfo = (TextView) findViewById(R.id.txtStudentinfo);
        btnBack = (Button) findViewById(R.id.btnBack);

        txtStudentinfo.setText("RollNO: "+rollNo+"\n"+"StudentName: "+studentName);
        getSupportActionBar().setTitle(title);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBack;
                iBack = new  Intent(SecoundActivity.this,MainActivity.class);
                startActivity(iBack);
            }
        });
    }
}
