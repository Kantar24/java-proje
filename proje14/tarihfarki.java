import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;


public class tarihfarki {

    public static void main(String[] args) {

        Date today = new Date();

        Calendar tday = new GregorianCalendar(TimeZone.getDefault());

        tday.setTime(today); // o anki zamani tday degiskenine aktariyoruz.

        Calendar xday = new GregorianCalendar(TimeZone.getDefault());
        xday.set(2020, 4, 4, 9, 5, 0);
       
        TimeUnit _unit = TimeUnit.DAYS; //GÜN FARKINI göster // day difference
       
        long x1 = tday.getTimeInMillis() - xday.getTimeInMillis();       
        long result = _unit.convert(x1, TimeUnit.MILLISECONDS);
       
        System.out.println(result);

    }
    
}
