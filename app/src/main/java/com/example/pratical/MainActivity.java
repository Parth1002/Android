package com.example.pratical;

/**
 *  Radio Button in Textbox view
 */

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioChecked(View view) {
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.Male:
                    if (checked)
                        Toast.makeText(MainActivity.this, "M", Toast.LENGTH_SHORT).show();
                        break;
                case R.id.Female:
                    if (checked)
                        Toast.makeText(MainActivity.this, "F", Toast.LENGTH_SHORT).show();
                        break;
            }
        }
    }
