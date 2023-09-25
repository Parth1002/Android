package com.example.parth.implicatiintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnDial, btnMsg, btnEmail, btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDial = (Button) findViewById(R.id.btnDial);
        btnMsg = (Button) findViewById(R.id.btnMsg);
        btnEmail = (Button) findViewById(R.id.btnEmail);
        btnShare = (Button) findViewById(R.id.btnShare);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iDial = new Intent(Intent.ACTION_DIAL);
                iDial.setData(Uri.parse("tel: +919173405238"));
                startActivity(iDial);
            }
        });

        btnMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMsg = new Intent(Intent.ACTION_SENDTO);
                iMsg.setData(Uri.parse("smsto:"+Uri.encode("+919173405238")));
                iMsg.putExtra("sms_body","please solve this issue asap.");
                startActivity(iMsg);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iEmail = new Intent(Intent.ACTION_SEND);
                iEmail.setType("message/rfc822");
                iEmail.putExtra(Intent.EXTRA_EMAIL,new String[]{"abc@gmail.com","xyz@gmail.com"});
                iEmail.putExtra(Intent.EXTRA_SUBJECT,"Queries");
                iEmail.putExtra(Intent.EXTRA_TEXT,"Please Resolve this issue asps");
                startActivity(Intent.createChooser(iEmail,"Email via"));
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iShare = new Intent(Intent.ACTION_SEND);
                iShare.setType("text/plain");
                iShare.putExtra(Intent.EXTRA_TEXT,"Dowunload Google App",https://play.google.com/store/search?q=amazon&c=apps);
                startActivity(Intent.createChooser(iShare,"Share via"));
            }
        });
    }
}
