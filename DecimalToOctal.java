package Java;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Dec=sc.nextInt();
        int t=Dec;
        String b="";
        while (t>0) {
            int r=t%8;
            t=t/8;
            b=r+b;
            //System.out.println(b);
        }
        System.out.println(b);
    }
}
