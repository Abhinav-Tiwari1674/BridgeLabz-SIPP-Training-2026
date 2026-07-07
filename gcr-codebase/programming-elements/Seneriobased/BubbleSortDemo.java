// A sports meet has 50 athletes with scores. Sort using Bubble Sort, 
// count total swaps, and flag if already sorted (best case). Repeat with 
// Insertion Sort. Find top-3 medalists. Trace pass-by-pass changes on 
// array [64, 25, 12, 22, 11].
 public class BubbleSortDemo {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        int n = arr.length;
        int swaps = 0;
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    sorted = false;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int x : arr) System.out.print(x + " ");

        System.out.println("\nTotal Swaps: " + swaps);
        if (sorted) System.out.println("Array was already sorted (Best Case)");
        else System.out.println("Array was not sorted initially");
    }
}



