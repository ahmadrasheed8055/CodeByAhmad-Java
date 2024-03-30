public class Lec26_Errors {
    public static void main(String[] args) {
        //There are three types of errors
        //1-Syntax Error: To break the rules of Language.
        //Example:
        // int a  : (Using ':' instead of ';')

        //2- Logical Error:
        //We want sum but program does wrong things, give another answer
        //This is mistake of programmer
        int a = 10, b = 20;
        int sum = a - b;
        System.out.println(sum);
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        //3- Runtime Error:
        // Program crash when it's running - This is also called Exception.
        // Example: A programmer is fetching data from an API, but encounters
        // an error during the fetching process.


        System.out.println("Printing Prime number: ");
        int n = 2;
        while (n < 20) {
            boolean inPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    inPrime = false;
                    break;
                }
            }

            if (inPrime == true) {
                System.out.print(n + " ");
            }
            n++;
        }


    }
}
