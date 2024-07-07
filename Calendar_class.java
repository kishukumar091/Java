import java.lang.ref.Cleaner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calendar_class {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MINUTE));

        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":"+c.get(Calendar.MINUTE) + ":"+c.get(Calendar.SECOND));

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2024));
        System.out.println(cal.isWeekDateSupported());
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[+5]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(cal.isLeapYear(2023));
    }
}
