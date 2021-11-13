public class Methods {
    static int max(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String args[]){
        int x= 10, y=20;
        int c= max(x,y);
        System.out.println(c);
    }
}
