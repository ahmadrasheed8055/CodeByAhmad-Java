public class _2_recursionPt1 {

    public static void printNumber(int limit){
        if (limit == 0) {
            return;
        }

        printNumber(limit - 1);
        System.out.print(limit + " ");
    }

    public static int factorial(int n){
        if (n == 1 || n == 0) {
            return 1;
        }

        return (n * factorial(n - 1));

    }

    public static void sumOfNumbers(int start ,int limit, int result){

        if (start == limit + 1) {
            System.out.println(result);
            return ;
        }

        result += start;
        sumOfNumbers(start + 1, limit, result);
//        System.out.println(start);

    }

    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");

        printFib(b, c, n - 1);


    }

    public static void main(String[] args) {
        printNumber(10);
        System.out.println();

        sumOfNumbers(1,  5, 0);

        int result =  factorial(5);
        System.out.println("Factorial is: " + result);
        System.out.print(0 + " " + 1 + " ");

        printFib(0, 1, 10);
    }
}
