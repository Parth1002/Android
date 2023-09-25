package com.example.parth.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private  static  final String CHANNEL_ID = "My Channel";

    private  static  final int NOTIFICATION_ID = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Drawable drawable = ResourcesCompat.getDrawable(getResources(),R.drawable.new_icon,null);

        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;

        Bitmap largeIcon = bitmapDrawable.getBitmap();

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification notification;

        if(android.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.0){
             notification = new Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.new_icon)
                    .setContentText("New Message")
                    .setSubText("New Message From Ram")
                    .setChannelId(CHANNEL_ID)
                    .build();
             nm.createNotificationChannel(new NotificationChennel(CHANNEL_ID,"New Channel",NotificationManager.IMPORTANCE_HIGH));
        }else{
            notification = new Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.new_icon)
                    .setContentText("New Message")
                    .setSubText("New Message From Ram")
                    .build();
        }
        nm.notify(NOTIFICATION_ID,notification);
    }
}
