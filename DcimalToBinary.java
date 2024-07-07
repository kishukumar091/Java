package Java;
import java.util.*;
public class DcimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Dec = sc.nextInt();
        int t=Dec;
        String b=" ";
        while (t>0) {
            int r=t%2;
            t=t/2;
            b=r+b;
        }
        System.out.println(b);
    }
}
