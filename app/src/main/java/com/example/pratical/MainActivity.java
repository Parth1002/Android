package com.example.pratical;

/**
 *
 */



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtNotice=findViewById(R.id.txtnotice);
        Button btnclick=findViewById(R.id.btnclick);

        DAOEmployee dao= new DAOEmployee();

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Employee emp = new Employee(txtNotice.getText().toString());
                dao.add(emp).addOnSuccessListener(suc->{
                    Toast.makeText(MainActivity.this, "Insert Database", Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(er->{
                    Toast.makeText(MainActivity.this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
                });
            }
        });
    }
}
