package com.example.parth.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btnclick);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* Custom set Toast */
                Toast toast = new Toast(getApplicationContext());

                View view = getLayoutInflater().inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.viewContainer));

                toast.setView(view);

                TextView txtMsg = (TextView) view.findViewById(R.id.txtmsg);

                txtMsg.setText("Message Sucessfully !!!");

                toast.setDuration(Toast.LENGTH_LONG);

                // toast.setGravity();

                toast.show();
                /* Custom set Toast */
            }
        });
    }
}
