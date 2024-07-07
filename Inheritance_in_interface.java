interface sampleInterface{
    void meth1();
    void meth2();
}
interface childInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childInterface{
    public void meth1() {
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class Inheritance_in_interface {
    public static void main(String[] args) {
        MySampleClass Sc = new MySampleClass();
        Sc.meth1();
        Sc.meth2();
        Sc.meth3();
        Sc.meth4();
    }
}
