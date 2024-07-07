package Java;
import java.util.*;
public class BinaryToDecimal {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int Binary=sc.nextInt();
    int t=Binary;
    int Decimal=0;
    int i=0;
    while (t>0) {
        int rem=t%10;
        t=t/10;
        Decimal=Decimal+rem*(int)Math.pow(2,i);
        i=i+1;
    }
    System.out.println(Decimal);
    } 
    
}