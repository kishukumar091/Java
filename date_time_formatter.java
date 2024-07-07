import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime dd= LocalDateTime.now(); //This is The Date
        System.out.println(dd);

        DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd/MM/yyyy"); //This is the format
        String myDate=dd.format(df1);//Creating date string using date and format
        System.out.println(myDate);

        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate2 =dd.format(df2);
        System.out.println(myDate2);


    }
}
