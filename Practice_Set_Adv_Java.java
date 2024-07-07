import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Practice_Set_Adv_Java {
    public static void main(String[] args) {
        //ps Q1
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Kishu");
        ar.add("Amisha");
        ar.add("Keshav");
        ar.add("Pratik");
        ar.add("Karishma");
        ar.add("Manisha");
        ar.add("happy");
        ar.add("nishu");
        ar.add("nitish");
        ar.add("krish");
        System.out.println(ar.clone());


        //ps Q5
        HashSet<Integer> s=new HashSet<>();
        s.add(5);
        s.add(51);
        s.add(52);
        s.add(53);
        s.add(54);
        s.add(55);
        s.add(5);

        System.out.println(s);


        //PS @2
        Date d=new Date();
        System.out.println(d.getHours() + ":" +d.getMinutes()+":"+d.getSeconds());


        //PS Q3
        Calendar a=Calendar.getInstance();
        System.out.println(a.get(Calendar.HOUR_OF_DAY)+":"+a.get(Calendar.MINUTE)+":"+a.get(Calendar.SECOND));


        //PS Q4
        LocalDateTime dt=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("H:m:s");
        String myDate=dt.format(df);
        System.out.println(myDate);
    }
}
