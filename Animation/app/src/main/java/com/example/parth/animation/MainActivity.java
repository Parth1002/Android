package com.example.parth.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAnim = (TextView) findViewById(R.id.txtAnim);

        Animation goga = AnimationUtils.loadAnimation(this,R.anim.goga);
        txtAnim.startAnimation(goga);
    }
}
