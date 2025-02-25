package keywords;

public class App {
    public static void main(String[] args) {
        // All classes extends Object class

        /*
        A a1 = new A();
        a1.data = 100;
        a1.count = 3000;
        A a2 = new A();
        a2.data = 1000;
        a1.count = 5000;

        System.out.println(a1.data + "   " + a1.count);
        System.out.println(a2.data + "   " + a2.count);
        System.out.println(A.count);
        a1.print();
        A.print();

         */

//        final int x = 100;
//        x = 200;

        // final keyword with properties
        /*
        A a = new A();
        a.data = 1000;


         */

        // Wrapper classes
        int i = 100;
        Double x = 100.5d;
        System.out.println(x.intValue());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.PI);
        // java is not fully OOP



    }
}

class A{
    // instance variable(per object) | static variable(one copy)
    final int data;
    static int count;

    public A(){
        this.data = 100;
    }
    static void print(){
        System.out.println("From print method");
    }

}

 class Tree{

    void water(){

    }
}

class ATree extends Tree{
    @Override
    void water(){

    }
}


