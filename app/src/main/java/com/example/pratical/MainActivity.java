package com.example.pratical;

/**
 * LinearLayout And CheckBox
 */

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    CheckBox CKGOOGLE;
    CheckBox CKYAHOO;
    CheckBox CKBING;
    Button Button;
    TextView TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CKGOOGLE=findViewById(R.id.CKGOOGLE);
        CKYAHOO=findViewById(R.id.CKYAHOO);
        CKBING=findViewById(R.id.CKBING);
        Button=findViewById(R.id.button);
        TextView=findViewById(R.id.textView2);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
                if(CKGOOGLE.isChecked()){
                    TextView.setText("YOUR SELECTED GOOGLE");
                }
                if(CKYAHOO.isChecked()) {
                    TextView.setText("YOUR SELECTED YAHOO");
                }
                if(CKBING.isChecked()){
                    TextView.setText("YOUR SELECTED BING");
                }
            }
        });

    }
}
