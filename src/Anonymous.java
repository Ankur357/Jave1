abstract class My1{
    abstract void display();
}
class Outer2{
    public void m(){
        My1 m = new My1(){
            public void display(){
                System.out.println("Hello");
            }
        };
        m.display();
    }
}
public class Anonymous {
}
