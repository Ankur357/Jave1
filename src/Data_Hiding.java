class rectangle{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
}
public class Data_Hiding {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.setLength(12);
        r.setBreadth(14);
        System.out.println("Area "+r.area());
        System.out.println("Perimeter "+r.perimeter());
    }
}


