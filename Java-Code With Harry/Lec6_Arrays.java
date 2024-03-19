

public class Lec6_Arrays {
    public static void main(String[] args) {
        // Declaring the array
        int size = 5;
        int[] arr = new int[size];
        arr[0] = 10;
        arr[1] = 23;
        arr[2] = 34;
        arr[3] = 56;
        arr[4] = 67;

        System.out.println("Printing list of array: ");
        for (int i = 0; i < size; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
