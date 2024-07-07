@FunctionalInterface
interface DemoAno{
    void meth1(int a);
   // void meth2();
}
//class AnonyDemo implements DemoAno {
//    public void display() {
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth2");
//    }
//}
public class lambda {
    public static void main(String[] args) {
//        AnonyDemo obj=new AnonyDemo();
//        obj.meth1();

        // Anonymous class
//        DemoAno obj=new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();
//        obj.meth2();

        //Lambda Expression

        DemoAno obj = (x) ->{
            System.out.println("I am meth1 "+x);
        };
        obj.meth1(3);
    }
}
