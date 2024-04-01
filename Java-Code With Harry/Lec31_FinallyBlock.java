
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

class ExA extends ArithmeticException {
    @Override
    public String toString() {
        return "Divided by zero!";
    }

    @Override
    public String getMessage() {
        return "Less then 10";
    }
}

class IndexEx extends ArrayIndexOutOfBoundsException{
    @Override
    public String toString() {
        return "Invalid index - 0 to 3";
    }
}

public class Lec31_FinallyBlock {
    // finally block runs in every situation
    static int fun(int n, int m) throws ExA {
        int r;
        try {
            //manually trow the exception
            if (m == 0) {
                throw new ExA(); // Throw exception only if m is 0
            }
            r = n / m;
            return r; // Return the result if division is successful
        } finally {
            System.out.println("Program 1 end");
            // No return statement here
        }
    }

    public static void main(String[] args) {
        System.out.println("Program 1");

        int result;
        try {
            result = fun(44, 0);
            System.out.println("Result : " + result);
        } catch (ExA e) {
            System.out.println(e.toString());
        }

        System.out.println("Program 2");
        for (int i = 0; i < 11; i++) {
            try{

                if (i < 10){
                    throw new ExA();
                }

            }catch (ExA e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("Program 2 end");
            }
        }

        System.out.println("Program 3");
        for (int i = 0; i < 10; i++) {
            try{
                if (i == 5) {
                    System.out.println("5 found");
                    break;
                }
            }catch (ExA e){
                System.out.println("No found");
            }finally {
                System.out.println("Program 3 end");
            }

        }

        System.out.println("Problem 4");
        int i = 0;
        String []names = new String[4];
        names[0] = "Ahmad";
        names[1] = "Rasheed";
        names[2] = "Ayoub";
        names[3] = "Ismat";
        Scanner sc = new Scanner(System.in);

        while (i < 5) {
            try {
                System.out.println("Try " + (i + 1));
                System.out.println("Enter index : ");
                int n = sc.nextInt();
                if (n > 3) { // Check if index is within array bounds
                    throw new IndexEx(); // Throw custom exception if index is invalid
                }
                System.out.println("Name at this index : " + names[n]);
                break; // Exit the loop if successful
            } catch (IndexEx e) {
                System.out.println(e.toString()); // Print the exception message
                i++; // Increment the tries
            }
        }


    }
}
