package com.example.firebase;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import org.jetbrains.annotations.NotNull;

public class FirebaseMsgService extends FirebaseMessagingService {
    private  static  final String CHANNEL_ID = "My Channel";
    private  static  final int NOTIFICATION_ID = 100;
    @Override
    public void onNewToken(@NonNull @NotNull String token) {
        super.onNewToken(token);
        Log.d("RefreshedToken",token);
    }

    @Override
    public void onMessageReceived(@NonNull @NotNull RemoteMessage message) {
        super.onMessageReceived(message);

        if (message.getNotification()!=null) {
            pushNotification(
                    message.getNotification().getTitle(),
                    message.getNotification().getBody()
            );
        }

    }

    private void pushNotification(String title,String Msg) {

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification notification;

        final String CHANNEL_ID = "push_noti";

        Intent iNotify = new Intent(this, MainActivity.class);
        iNotify.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pi = PendingIntent.getActivities(this,100,new Intent[]{iNotify},PendingIntent.FLAG_UPDATE_CURRENT);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "Custom Channel";
            String description = "Channel for Push Notification";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel channel = new NotificationChannel(CHANNEL_ID,name,importance);
            channel.setDescription(description);

            if (nm!=null){
                nm.createNotificationChannel(channel);
            }

            notification = new Notification.Builder(this)
                    .setSmallIcon(R.drawable.new_icon)
                    .setContentText(title)
                    .setSubText(Msg)
                    .setAutoCancel(true)
                    .setChannelId(CHANNEL_ID)
                    .build();

            nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID,"New Channel",NotificationManager.IMPORTANCE_HIGH));
        }else{
            notification = new Notification.Builder(this)
                    .setSmallIcon(R.drawable.new_icon)
                    .setAutoCancel(true)
                    .setContentText(title)
                    .setSubText(Msg)
                    .build();
        }
        if(nm!=null){
            nm.notify(1,notification);
        }
    }
}
