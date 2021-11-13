class parent{
    public void display(){
        System.out.println("Hello");
    }
}
class child extends parent{
    @Override
    public void display(){
        System.out.println("World");
    }
}
public class Over_ridding {
    public static void main(String[] args) {
//        parent p = new parent();
//        p.display();
//        child c = new child();
//        c.display();
        parent p = new child();
        p.display();
    }
}
