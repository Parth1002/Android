package com.example.parth.sharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textview);
        editText = (EditText) findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = editText.getText().toString();

                SharedPreferences shrd = getSharedPreferences("demo",MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();

                editor.putString("str",msg);
                editor.apply();
                textView.setText(msg);
            }
        });

        // Get the value of shared preference back
        SharedPreferences getShared = getSharedPreferences("demo",MODE_PRIVATE);
        String value = getShared.getString("str","SAVE A NOTE AND IT WILL SHOW UP HERE");
        textView.setText(value);
    }
}
