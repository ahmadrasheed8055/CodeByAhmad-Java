import java.util.Scanner;

class TableEx extends Exception {
    @Override
    public String toString() {
        return "Number is less than 1";
    }
}

class checkNegative extends Exception {
    @Override
    public String toString() {
        return "Invalid input";
    }
}

public class Lec30_ThrowsAndThrow {
    public static void printTable(int n) throws TableEx {
        if (n < 1) {
            throw new TableEx();
        }
        // Logic to print table
    }

    public static void checkNegative(int n) throws checkNegative {
        if (n < 10) {
            throw new checkNegative();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number for printing table:");
//        int n = sc.nextInt();
        System.out.println("Exception method 1");

        try {
            printTable(0);
        } catch (TableEx e) {
            System.out.println(e.toString());
        }
        System.out.println("Exception method 2");
        try {
            checkNegative(9);

        } catch (checkNegative c) {
            System.out.println(c.toString());
        }
    }
}
