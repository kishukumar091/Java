import java.util.ArrayDeque;
import java.util.Scanner;

public class arrayDeque {

    public static void printHelloWorld(){
        System.out.println("Hello world");
    }

    public static int sum(int a,int b) {
        int x=a;
        int y=b;
        int add= x+y;
        return add;
    }
    public static void main(String[] args) {
        printHelloWorld();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int e=sum(a,b);
        System.out.println(e);
    }
}
