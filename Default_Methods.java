interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("recording in 4k...");
    }
}
interface wifi{
    String [] getNetwork();
    void connectToNetwork(String Network);
}
class MyCellPhone{
    void cellNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements wifi,Camera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    /*public void record4KVideo(){
        System.out.println("Taking snap and Recording in 4K");
    }*/
    public String [] getNetwork(){
        System.out.println("getting List of networks");
        return new String[]{"Kishu","Singh","Rajput"};
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
    }
}
public class Default_Methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        //ms.greet(); ---> Throw an error
        String [] ar = ms.getNetwork();
        for (String item:ar) {
            System.out.println(item);
        }
    }
}
