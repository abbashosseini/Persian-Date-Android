package app.com.hosseini.abbas.tarikh;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;

import app.com.hosseini.abbas.tarikh.App.MyApp;
import app.com.hosseini.abbas.tarikh.dates.TodayStatus;
import app.com.hosseini.abbas.tarikh.dates.Utilities;
import app.com.hosseini.abbas.tarikh.dates.getToday;


public class ServiceClass extends Service {
    private IBinder iBinder = new Binder();

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {



        String ns = Context.NOTIFICATION_SERVICE;
        NotificationManager mNotificationManager =
                (NotificationManager) getApplicationContext().getSystemService(ns);

            Notification notification =
                    new Notification.Builder(MyApp.getContext())
                    //.setContentTitle("")
                    .setContentText("abbas")
                    .setSmallIcon(R.drawable.ico)
                    .build();
//

            TodayStatus Status = new TodayStatus();


            CharSequence contentTitle = "امروز  : " + getToday.Now();

            CharSequence contentText;

            contentText = Status.TodayStatus(Utilities.getCurrentShamsidate()) ;

            MainActivity.setDate(getToday.Now(), contentText.toString());

            notification.setLatestEventInfo(getApplicationContext(), contentTitle,
                    contentText, PendingIntent.getActivity(getApplicationContext(), 0, new Intent(), 0));
            notification.flags |= Notification.FLAG_NO_CLEAR;
            mNotificationManager.notify(1, notification);


        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }
}
