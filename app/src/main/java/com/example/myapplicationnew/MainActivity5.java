package com.example.myapplicationnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void newnotification(View view) {
        NotificationManager notificationManager = (NotificationManager)  MainActivity5.this.getSystemService(Context.NOTIFICATION_SERVICE);

        int notificationId = 1;
        String channelId = "channel-01";
        String channelName = "Channel Name";
        int importance = NotificationManager.IMPORTANCE_HIGH;

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel mChannel = new NotificationChannel(
                    channelId, channelName, importance);
            notificationManager.createNotificationChannel(mChannel);
        }

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity5.this, channelId)
                .setLargeIcon(BitmapFactory.decodeResource(MainActivity5.this.getResources(), android.R.drawable.ic_media_play))
                .setSmallIcon(android.R.drawable.ic_media_play).setContentTitle("You can also 'Learn Android'")
                .setStyle(new NotificationCompat.BigPictureStyle().bigPicture(BitmapFactory.decodeResource(MainActivity5.this.getResources(), android.R.drawable.ic_media_play)))
                .setContentText("Contact AndroidManifester today!!");

        Intent intent = new Intent(MainActivity5.this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity5.this, 0, intent, PendingIntent.FLAG_MUTABLE);
        mBuilder.setContentIntent(pendingIntent);

        notificationManager.notify(notificationId, mBuilder.build());
    }
}