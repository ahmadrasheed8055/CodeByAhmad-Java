public class Lec12_Recursion {
    static int factorial(int n) {
        //base case
        if (n  == 0 || n == 1){
            return 1;
        }

        int ans;
        ans = n * factorial(n - 1);
        System.out.println(ans + " *  " + n + " = " + ans* n);
        return ans;
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int ans = fibonacci(n - 1) + fibonacci(n - 2);
            return ans;

        }
    }


    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println();
        System.out.println("Factorial is : " + ans);
        for (int i = 0; i < 5; i++) {
            System.out.println(fibonacci(i));
        }

    }

}
