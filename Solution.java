import java.util.*;
interface AdvancedArithmetic{
    int divisor_sum(int n);
}

//Write your code here
class My_calculator4 implements AdvancedArithmetic {
    public int divisor_sum(int x){
        int sum =0;
        for(int i=1;i<=x;i++){

            if(x%i==0){
                sum=sum+i;
            }
            else{
                continue;
            }
        }
        return sum;
    }
}

class Solution{
    public static void main(String []args){
        My_calculator4 my_calculator4 = new My_calculator4();

        Scanner sc = new Scanner(System.in);
        System.out.print("I implemented: ");
        int n = sc.nextInt();
        System.out.print(my_calculator4.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */

}