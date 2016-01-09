package app.com.hosseini.abbas.tarikh;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import app.com.hosseini.abbas.tarikh.App.MyApp;

/*
* @pp Tarikh/Date
* Created by Abbas hosseini
*
* 2016 jan 9
* */
public class MainActivity extends ActionBarActivity {

    private static TextView toDay;
    private static TextView dat;
    private static TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Typeface FtoDay = Typeface.createFromAsset(getAssets(),"Far_TitrDF.ttf");
        Typeface Fdate = Typeface.createFromAsset(getAssets(),"Far_Ekhlass.ttf");


        toDay = (TextView) findViewById(R.id.toDay);
        toDay.setTypeface(Fdate);


        dat = (TextView) findViewById(R.id.date);
        dat.setTypeface(Fdate);


        title = (TextView) findViewById(R.id.title);
        title.setTypeface(FtoDay);






        MyApp app = new MyApp();
        app.setContext(getApplicationContext());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public static void setDate(String Today, String date){

        toDay.setText(Today);
        dat.setText(date);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = new Intent(this, ServiceClass.class);
        startService(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
