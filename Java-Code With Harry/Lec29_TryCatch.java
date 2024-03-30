
import java.util.Scanner;

public class Lec29_TryCatch {

    public static void print(int n){
        System.out.println(n);
    }

    public static void main(String[] args) {
        System.out.println("Hello! Try Catch program");
        Scanner sc = new Scanner(System.in);

        System.out.println("Problem 1");
        System.out.println("Enter two numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("Problem 2");
        try {
            int r = n/m;
            System.out.println("Result : " + r);

        }catch (Exception ex){
            System.out.println("Field to divide");
            System.out.println(ex);
        }

        System.out.println("Problem 3");
        try{
            int s = sc.nextInt();
            System.out.println(s);
        }catch (Exception ex){
            System.out.println("Field to input");
            System.out.println(ex);
        }

        System.out.println("Problem 4");
        try{
            int x = sc.nextInt();
            print(n);

        }catch (Exception e){
            System.out.println("Field to pass");
            System.out.println(e);
        }

        System.out.println("End of Program!");

    }

}
