package April_11th_12th_Sorting;

class Quick_Sort {

    // Partition function
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choosing lst element as index
        int i = low - 1; // pointer for smaller elements

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // swap if current element is smaller than pivot
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high); // Place pivot in correct position
        return i + 1; // Return pivot index
    }

    // Swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // The QuickSort function implementation
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1); // Sort left part
            quickSort(arr, pivot + 1, high); // Sort right part
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
