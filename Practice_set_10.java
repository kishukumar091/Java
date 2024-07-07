class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non parameterized constructor");
    }
    Circle(int r){
        System.out.println("I am circle parameterised constructor");
        this.radius=r;
    }
    public void area(){
        double c= Math.PI*this.radius*this.radius;
        System.out.println(c);
    }
}
class cylinder extends Circle{
    public int height;
    cylinder(int r,int h){
        super(r);
        System.out.println("I am cylinder parameterised constructor");
        this.height=h;
    }
    public void volume(){
        double d= Math.PI*this.radius*this.radius*this.height;
        System.out.println(d);
    }
}
public class Practice_set_10 {
    public static void main(String[] args) {
        //Circle obj=new Circle(12);
        cylinder obj1=new cylinder(12,4);
        obj1.area();
        obj1.volume();
    }
}
