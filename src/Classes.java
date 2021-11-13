class Outer1{
    static int x= 5;
    Inner i = new Inner();
    class Inner{
        int y=10;
        public void innerDisplay(){
            System.out.println(x+" "+y);
        }
        }
    public void outerDisplay(){
      //  Inner i= new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}
public class Classes {
    public static void main(String[] args) {
//        Outer1 o = new Outer1();
//        o.outerDisplay();
        Outer1.Inner i = new Outer1().new Inner();
         i.innerDisplay();

    }
}
