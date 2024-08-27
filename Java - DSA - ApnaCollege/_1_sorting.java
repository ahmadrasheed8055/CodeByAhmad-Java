public class _1_sorting {

    // Printing array
    static public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Bubble sort
    static public void bubbleSort(int arr[]) {
        System.out.println("Bubble Sort: ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        System.out.println("Selection Sort: ");

        int smallest;
        for (int i = 0; i < arr.length; i++) {
            smallest = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            if (smallest != i) {
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        System.out.println("Insertion sort: ");
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i]; // Take the current element
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than current, to one position ahead of their current position
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the current element in its correct position
            arr[j + 1] = current;
        }
    }



    public static void main(String[] args) {
        _1_sorting obj = new _1_sorting();

        int arr[] = {33, 5, 2, 22, 8};
        bubbleSort(arr);
        printArray(arr);

        int arr2[] = {33, 5, 2, 22, 8};
        selectionSort(arr2);
        printArray(arr2);

        int arr3[] = {33, 5, 2, 22, 8};
        insertionSort(arr3);
        printArray(arr3);
    }
}
