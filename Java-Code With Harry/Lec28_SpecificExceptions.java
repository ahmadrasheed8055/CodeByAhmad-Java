import java.util.*;

class MyException extends Exception {
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

public class Lec28_SpecificExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Problem 1");
        int[] marks = new int[1];
        marks[0] = 10;
        boolean flag = true;

        while (flag) {

            // it work like if-else statement
            System.out.println("Enter index to find marks: ");
            try { // if block
                int i = sc.nextInt();
                System.out.println(i);
                System.out.println("Marks : " + marks[i]);

                //nested try-catch (Nested if-else)
                try { // if block
                    int n = marks[i] / 0;
                    flag = false;

                    System.out.println(n);
                } catch (ArithmeticException e) { // else-if block
                    System.out.println("Arithmetic Exception");
                }

            } catch (ArrayIndexOutOfBoundsException e) { //else-if block

                //Specific exception
                System.out.println("Array Index Out Of Bounds Exception");
                System.out.println(e);

            } catch (Exception e) { // else block - when all statements rejected
                System.out.println("Some other Exception occur");
                System.out.println(e);
            }


        }


        System.out.println("Problems End!");
    }
}
