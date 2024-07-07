interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo...");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedUp...");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleKishu = new AvonCycle();
        cycleKishu.applyBrake(9);
        cycleKishu.speedUp(10);
        cycleKishu.blowHorn();
    }
}
