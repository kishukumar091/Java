abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    @Override
    void refill() {
        System.out.println("Refill");
    }

    @Override
    void write() {
        System.out.println("Write");
    }
    void changeNib(){
        System.out.println("Changing the Nib");
    }
}

public class Pract_Abstract {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();
        pen.refill();
        pen.write();

    }
}
