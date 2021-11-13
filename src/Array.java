public class Array {
    public static void main(String[] args) {
        int a[] = {1,3,4,5,6,8};
        int b[]= new int[5];
        int[] c = new int[6];
//        for(int i=0;i<a.length; i++)
//        {
//            System.out.println(a[i]);
//    }
        for(int x:a)
        {
            System.out.println(x);
        }
    }
}
