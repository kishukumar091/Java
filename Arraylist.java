import java.sql.SQLOutput;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> L1=new ArrayList<>();
        ArrayList<Integer> L2=new ArrayList<>();

        L1.add(2);
        L1.add(23);
        L1.add(34);
        L1.add(13);
        L1.add(31);
        L1.add(2,8);
        L1.add(0,11);


        L2.add(234);
        L2.add(2);
        L2.add(20);
        L2.add(556);
        L2.add(56);
        L2.add(12);
        //L1.addAll(L2);  // Insert All the element in the last in L1
        //L1.addAll(5,L2);  // Insert by index


        for(int i=0;i<L1.size();i++){
            System.out.print(L1.get(i));
            System.out.print(",");
        }
        System.out.println();


        //  L1.clear();
        L1.set(0,100);

        System.out.println(L1.indexOf(8));
        System.out.println(L2.lastIndexOf(8));
        System.out.println(L1.getClass());
        System.out.println(L2.contains(2));
        System.out.println(L1.addAll(L2));
        System.out.println(L2.addAll(L1));
        System.out.println(L1.clone());
        System.out.println(L2.clone());
        System.out.println(L1.isEmpty());
        System.out.println(L1.equals(L2));
        System.out.println();


    }
}
