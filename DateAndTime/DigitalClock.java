package dateandtime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DigitalClock {

    public static void main(String[] args) {
        setTime();
    }

    public static void setTime() {
        Calendar calendar;
        SimpleDateFormat timeFormat;
        String time;
        timeFormat = new SimpleDateFormat("kk:mm:ss");

        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            System.out.println(60000);
            try {
                Thread.sleep(type);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
