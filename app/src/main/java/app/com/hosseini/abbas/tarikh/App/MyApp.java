package app.com.hosseini.abbas.tarikh.App;

import android.app.Application;
import android.content.Context;

public class MyApp extends Application {

    private static Context context;

    public static Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        MyApp.context = context;
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}