package function;

public class App {
    public static void main(String[] args) {

        // lambda expression
        // interface that contain one abstract method
        print((name)->{
            System.out.println("Hello " + name);
            System.out.println("Hello " + name.toUpperCase());
        });

    }

    private static void print(Printable p){
        p.print("Abdallah");
    }
}

@FunctionalInterface
interface Printable{
    void print(String name);


}
