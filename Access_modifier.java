class C1{
    public int x=5;
    protected int y=23;
    int z=45;
    private  int w=34;
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
}
public class Access_modifier {
    public static void main(String[] args) {
        C1 cs=new C1();
        cs.meth();
        System.out.println(cs.z);
        System.out.println(cs.x);
        System.out.println(cs.y);
        //System.out.println(cs.w);  --> Private modifier can not use in same package
    }
}
