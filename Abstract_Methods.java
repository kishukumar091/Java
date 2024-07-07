abstract class Base1{
    public Base1(){
        System.out.println("I am constructor of base");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Base2 extends Base1{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
abstract class Base3 extends Base1{
    public void kishu(){
        System.out.println("I am good");
    }
}

public class Abstract_Methods {
    public static void main(String[] args) {
        //Base1 b1=new Base1();   ...Error
        Base2 b2=new Base2();
        //Base3 b3=new Base3();   ...Error
        b2.sayHello();
        b2.greet();
        b2.greet2();
    }
}
