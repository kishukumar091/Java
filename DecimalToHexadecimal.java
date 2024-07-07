package Java;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Dec=sc.nextInt();
        int t=Dec;
        char[] reminder={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String b="";
        while (t>0) {
            int r=t%16;
            t=t/16;
            b=reminder[r]+b;
        }
        System.out.println(b);
    }
}
