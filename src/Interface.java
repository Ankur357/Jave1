interface Test1{
    void m1();
    void m2();
}
class My implements Test1{
   public void m1(){
       System.out.println("Method 1");
   }
   public void m2(){
       System.out.println("Method 2");
   }
    public void m3(){
        System.out.println("Method 3");
    }
}
public class Interface {
    public static void main(String[] args) {
        Test1 t;
        Test1 m = new My();
        m.m1();
        m.m2();

    }
}
