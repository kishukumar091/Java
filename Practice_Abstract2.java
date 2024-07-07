interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump() {
        System.out.println("Monkey is jumping");
    }
    void bite(){
        System.out.println("Bite");
    }
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Just say Hi..");
    }
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

   /* @Override
    void bite() {
        super.bite();
    }

    @Override
    void jump() {
        super.jump();
    }*/
}
public class Practice_Abstract2 {
    public static void main(String[] args) {
        Human h = new Human();
        h.bite();
        h.eat();
        h.sleep();
        h.jump();

        Monkey m = new Human();
        m.bite();
        m.jump();
        //m.speak(); --> Error found
        //m.sleep(); --> Error found

        BasicAnimal Bc = new Human();
        Bc.eat();
        Bc.sleep();
        //Bc.jump(); -->Error found
        //Bc.speak(); -->Error found
    }
}
