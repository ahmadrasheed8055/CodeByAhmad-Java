import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidChoiceException extends Exception {
    @Override
    public String toString() {
        return "Invalid choice! Please enter a number between 1 and 4.";
    }
}

class ValueOutOfRangeException extends Exception {
    @Override
    public String toString() {
        return "Value is out of range! Please enter values less than or equal to 1000.";
    }
}

class DivisionByZeroException extends Exception {
    @Override
    public String toString() {
        return "Division by zero is not allowed!";
    }
}

    public class Lec32_CalculatorAndExceptions {
    private int val1, val2;

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======= WELCOME TO CALCULATOR ========");
        try {
            System.out.println("Enter value 1 : ");
            int n1 = sc.nextInt();
            System.out.println("Enter value 2 : ");
            int n2 = sc.nextInt();

            if (n2 == 0 || n1 > 1000 || n2 > 1000) {
                throw new ValueOutOfRangeException();
            }

            System.out.println("Enter your choice : \n" +
                    "1- Addition\n" +
                    "2- Subtraction\n" +
                    "3- Multiplication\n" +
                    "4- Division");

            int choice = sc.nextInt();
            if (choice < 1 || choice > 4) {
                throw new InvalidChoiceException();
            }

            switch (choice) {
                case 1:
                    System.out.println("Sum of these numbers is : " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Subtraction of these numbers is : " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Multiplication of these numbers is : " + (n1 * n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        throw new DivisionByZeroException();
                    }
                    System.out.println("Division of these numbers is : " + (n1 / n2));
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
        } catch (InvalidChoiceException | ValueOutOfRangeException | DivisionByZeroException e) {
            System.out.println(e.toString());
        }
    }
}
