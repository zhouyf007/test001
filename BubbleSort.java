// Bubble Sort implementation
public class BubbleSort {
    public static void main(String[] args) {
        // Array to be sorted
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Before sorting:");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("After sorting:");
        printArray(arr);
    }
    
    // Bubble Sort algorithm
    public static void bubbleSort(int[] arr) {
        // Get array length
        int n = arr.length;
        // Outer loop: controls number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop: compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if previous element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Print array elements
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
