public class Lec3_Conditions_Operators {

    public static void main(String[] args) {
        int a = 110;
        int b = 10;
        int c = 2;

        boolean result = (a==b);

        if (result){
            System.out.println("Option 1");
            System.out.println(a*b + c);
        } else if (!result && c == 2) {
            System.out.println("Option 2");
            System.out.println(a*b+c);
        } else if (result || c == 2) {
            System.out.println("Option 3");
            System.out.println(a*b+c);
        }else {
            System.out.println("Option 4");
        }

        //Switch case
        int choice = 4;
        switch (choice) {
            case 1:
                System.out.println("You entered 1.");
                break;
            case 2:
                System.out.println("You entered 2.");
                break;
            case 3:
                System.out.println("You entered 3.");
                break;
            case 4:
                System.out.println("You entered 4.");
                break;
            case 5:
                System.out.println("You entered 5.");
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
        }

    }


}
