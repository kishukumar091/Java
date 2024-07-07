class base{
    public void add(){
        System.out.println("x+y");
    }
}
class derived extends base{
    @Override             //Annotations
    public void add(){
        System.out.println("jsd");
    }
    public int sum(int x,int y){
        return x+y;
    }
}

public class Annotations {
    @SuppressWarnings("deprication")
    public static void main(String[] args) {
        derived f= new derived();
        f.add();
        f.sum(3,4);

    }
}
