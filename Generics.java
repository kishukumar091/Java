import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        //arrayList.add("str1");
        arrayList.add(32);
        arrayList.add(44);
        arrayList.add(4);
        arrayList.add(412);
        int a=(int)arrayList.get(2);// 'int' is redundant
        System.out.println(a);
    }
}
