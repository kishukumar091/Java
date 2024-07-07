package Java;
import java.util.Scanner;
public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Binary=sc.nextInt();
        int p=Binary;
        int Octal=0;
    int i=0;
    while (p>0) {
        int rem=p%10;
        p=p/10;
        Octal=Octal+rem*(int)Math.pow(8,i);
        i=i+1;
    }
    System.out.println(Octal);
    }
}
