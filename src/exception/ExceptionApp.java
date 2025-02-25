package exception;


import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {

       Scanner scn = new Scanner(System.in);
       try {
           int x = scn.nextInt();
           int y = scn.nextInt();

           System.out.println(x / y);
       }catch (ArithmeticException ex){
           System.out.println(ex.getMessage());
       }catch(Exception ex){

       }

    }
}
