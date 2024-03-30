import java.util.Scanner;

class MyE extends Exception {


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return "Less then 9 not allowed";
    }
}

public class Lec29_Throw {
    public static void main(String[] args) throws MyE {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        n = sc.nextInt();
        if (n < 10) {
            try {
                System.out.println(n);
                throw new MyE();

            }catch (MyE e){

                System.out.println(e.getMessage());
//                e.printStackTrace();
//                System.out.println(e.getCause());
            }
        } else if (n > 20) {
            throw new ArithmeticException(" grater than 20 No allowed");
        }
    }

}
