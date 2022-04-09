package com.example.pratical;

/**
 *
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText TextUrl;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextUrl=findViewById(R.id.TextUrl);
        btnClick=findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, TextUrl.getText().toString(), Toast.LENGTH_SHORT).show();
                Log.d("click", "onClick: open url");

                Uri webpage=Uri.parse(TextUrl.getText().toString());
                Intent intent = new Intent(Intent.ACTION_VIEW,webpage);

                if(intent.resolveActivity(MainActivity.this.getPackageManager())!=null){
                    startActivity(intent);
                }
            }
        });

    }
}
