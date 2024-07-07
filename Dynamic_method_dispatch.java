class Phone{
    public void showtime(){
        System.out.println("Time is 8am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on smartphone");
    }
}
public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        //Phone obj=new Phone();
        //Smartphone spobj = new Smartphone();
        //obj.on();
        //spobj.music();

        Phone obj = new Smartphone();
        obj.showtime();
        obj.on();
        //obj.music(); Not Allowed
    }
}
