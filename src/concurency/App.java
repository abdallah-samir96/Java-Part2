package concurency;

public class App {
    public static void main(String[] args) {


        new Thread(()->{

            for (int i = 1; i <= 5000; i++) {
                System.out.println(i);
            }

        }).start();

       new Thread(()->{

            for (int i = 5001; i <= 10_000; i++) {
                System.out.println(i);
            }

        }).start();








    }
}
