class Outer {
    void display(){
        System.out.println("Hello");

    }
    class inner{
        void display(){
            System.out.println("World");

        }
    }

    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.inner obj1 = obj.new inner();
        obj.display();
        obj1.display();

    }
}


