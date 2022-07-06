package dateandtime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DigitalClock {

    public static void main(String[] args) {
        setTime('s');
    }

    public static void setTime(char type) {

        int second = 1000;
        int minute = 60000;
        int hour = 3600000;
        
        switch (type) {
            case 's': // 1 second
                timeCalc(second);
                break;
            case 'm': // 1 minute
                timeCalc(minute);
                break;
            case 'h': // 1 hour
                timeCalc(hour);
                break;
            default:
                System.out.println("Invalid type");
        }
        
    }

    public static void timeCalc(int type) {
        Calendar calendar;
        SimpleDateFormat timeFormat;
        String time;
        timeFormat = new SimpleDateFormat("kk:mm:ss");

        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            System.out.println(time);
            try {
                Thread.sleep(type);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
