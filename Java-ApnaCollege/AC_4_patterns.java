public class AC_4_patterns {
    public static void main(String[] args) {
        System.out.println("Pattern 1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {

            System.out.print("*");
            }
            System.out.print('\n');
        }

        System.out.println("Pattern 2");

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.print('\n');
        }

        System.out.println("Pattern 3");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
        }

    }
}
