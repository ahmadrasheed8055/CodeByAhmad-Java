import java.util.*;

public class Lec9_Methods {

    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    static int add(int n, int m) {
        return (n + m);
    }


    public static void main(String[] args) {

        while (true) {
            System.out.println("We are going to create three diff methods:");
            System.out.println("Select one of these : \n 1-Create table 2-Add two numbers");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();


            if (choice == 1) {
                System.out.println("Enter number for printing table : ");
                int num = sc.nextInt();
                table(num);
            } else if (choice == 2) {
                System.out.println("Enter number 1 : ");
                int num1 = sc.nextInt();
                System.out.println("Enter number 2 : ");
                int num2 = sc.nextInt();

                int ans = add(num1, num2);
                System.out.printf("Answer is : %d", ans);

            } else {
                System.out.println("Invalid choice!");
            }

            char n;
            System.out.print("\nDo you want to run again?(0-No,1-Yes) : ");
            n = sc.next().charAt(0);

            if (n == '0') {
                break;
            } else {
                continue;
            }
        }
    }
}
