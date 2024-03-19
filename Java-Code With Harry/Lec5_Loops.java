public class Lec5_Loops {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println("For loop!");
        }
        n = 5;
        while (n > 0) {
            System.out.println("While loop!");
            n--;
        }
        n = 5;
        do {
            System.out.println("Do-While loop!");
            n--;
        } while (n > 0);

    }
}
