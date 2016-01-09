package app.com.hosseini.abbas.tarikh.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by root on 9/26/15.
 */
public class getToday {

    public static String Now(){
        // Otherwise, use the form "Mon Jun 3"
        Date calendar = new Date();
        SimpleDateFormat shortenedDateFormat = new SimpleDateFormat("EEE MM dd", Locale.ENGLISH);
        String SplitDate =  shortenedDateFormat.format(calendar);

        String[] ArraySplitDate = SplitDate.split(" ");

        String DayWeek = "";
        if (ArraySplitDate[0].equals("Sun"))
            DayWeek = "يکشنبه";
        else if (ArraySplitDate[0].equals("Mon"))
            DayWeek = "دوشنبه";
        else if (ArraySplitDate[0].equals("Tue"))
            DayWeek = "سه شنبه";
        else if (ArraySplitDate[0].equals("Wed"))
            DayWeek = "چهارشنبه";
        else if (ArraySplitDate[0].equals("Thu"))
            DayWeek = "پنج شنبه";
        else if (ArraySplitDate[0].equals("Fri"))
            DayWeek = "جمعه";
        else if (ArraySplitDate[0].equals("Sat"))
            DayWeek = "شنبه";

        return DayWeek;//+ " " +DayStr+" "+MonthStr;
    }
}
