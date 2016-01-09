package app.com.hosseini.abbas.tarikh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by root on 8/16/15.
 */
public class DirectToService extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent service = new Intent(context, ServiceClass.class);
        context.startService(service);
    }
}
