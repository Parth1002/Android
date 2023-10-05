package com.example.firebase;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.*;
import com.google.firebase.messaging.FirebaseMessaging;
import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener<String>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<String> task) {

                if (!task.isSuccessful()){
                    Log.e("TokanDetails", "Tokan Failed to Receive!!!");
                    return;
                }
                String tokan = task.getResult();
                Log.d("TOKAN",tokan);
            }
        });

        // Realtime Database

        //Single Node Database
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("CopyWright");

        databaseReference.setValue("JAY SHREE KRISHNA");

        //Multiple Node Database
        DatabaseReference contactRef = FirebaseDatabase.getInstance().getReference("contacts");

        String contactID = contactRef.push().getKey();

        ContactModel contactModel = new ContactModel("Ronak","988586588");

        contactRef.child(contactID).setValue(contactModel);

        // Receiving Database
        contactRef.child(contactID).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {

                ContactModel model = snapshot.getValue(ContactModel.class);

                Log.d("contact",model.getName()+", "+model.getMobNo());

            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {
                Log.d("DBError",error.toString());
            }
        });

    }
}