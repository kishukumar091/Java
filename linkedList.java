import java.util.*;
public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll1=new LinkedList<>();
        LinkedList<Integer> ll2=new LinkedList<>();
        ll1.add(2);
        ll1.add(21);
        ll1.add(22);
        ll1.add(42);
        ll1.add(562);
        ll1.add(72);
        ll1.add(28);
        ll1.add(25);

        ll2.add(26);
        ll2.add(27);
        ll2.add(29);
        ll2.add(30);
        ll2.add(31);
        ll2.add(32);
        ll2.add(33);
        ll2.add(34);
        for(int i=0;i<ll1.size();i++){
            System.out.print(ll1.get(i));
            System.out.print(",");
        }
        System.out.println();

        System.out.println(ll1.clone());
        System.out.println(ll1.getFirst());
        System.out.println(ll1.addAll(ll2));
    }
}
