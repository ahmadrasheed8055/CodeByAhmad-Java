import java.util.*;

public class AC_2_conditions {
    public static void main(String[] args) {

//        System.out.println("Checking Even or Odd");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number : ");
//        int n = sc.nextInt();
//        if (n % 2 == 0){
//            System.out.println("Number is Even");
//        }else {
//            System.out.println("Number is Odd");
//        }

//        System.out.println("Selecting Days");
//        char days;
//        System.out.print("Enter first character of day and it will print : ");
//        days = sc.next().charAt(0);
//        if (days == 'm'){
//            System.out.println("Monday");
//        } else if (days == 't') {
//            System.out.println("Tuesday");
//        } else if (days == 'w') {
//            System.out.println("Wednesday");
//        } else if (days == 'h') {
//            System.out.println("Thursday");
//        } else if (days == 'f') {
//            System.out.println("Friday");
//        } else if (days == 's') {
//            System.out.println("Saturday");
//        } else if (days == 'n') {
//            System.out.println("Sunday");
//        }else {
//            System.out.println("Invalid character!");
//        }
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            default:
                System.out.println("Invalid number");
        }
    }

}
