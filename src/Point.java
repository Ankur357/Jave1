public class Point {
    private int x,y;
    public Point(){
        x=5;
        y=10;
    }
    Point(int x, int y){
        this.x=x;
        this.y=y;

    }
    public void setX(int x){
      this.x=x;

    }
    public void setY(int y){
        this.y = y;

    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;

    }
}
class Pointer{
    public static void main(String[] args) {
        Point obj=new Point();
        Point obj1=new Point(3,2);
        obj.setX(5);
        obj.setY(6);
        obj.setXY(20,40);
    }
}
