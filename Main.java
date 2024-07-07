import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number 1");
            int a = sc.nextInt();
            System.out.println("Enter number 2");
            int b = sc.nextInt();

            int sum = a + b;
            System.out.println("The sum of these number is");
            System.out.println(sum);

            Scanner xx = new Scanner(System.in);
            System.out.println("enter nu 3");


            float c = sc.nextFloat();
            System.out.println("enter nu 4");
            float d = sc.nextFloat();
            float diff = c - d;
            System.out.println("The diff of these nu is");
            System.out.println(diff);

            Scanner cc = new Scanner(System.in);
            double e = sc.nextDouble();
            double f = sc.nextDouble();
            double mul = e / f;
            System.out.println(mul);


            Scanner vv = new Scanner(System.in);
            int z = sc.nextInt();
            int n = sc.nextInt();
            int rem = z % n;
            System.out.println(rem);


        }
    }
}