import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,8.5f);
        myHashSet.add(60);
        myHashSet.add(1);
        myHashSet.add(623);
        myHashSet.add(3);
        myHashSet.add(6);
        System.out.println(myHashSet);
    }
}
