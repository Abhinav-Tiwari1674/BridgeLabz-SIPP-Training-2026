// a sports meet has 50 athletes with scores. sort using bubble sort, count total swaps,
//  and flag if already sorted. repeat with insertion sort and selection sort. find top 3 -3 meadlists.
//   trace pass by pass changes on 
// array [64, 25, 12, 22, 11, 45, 23,  44, 56, 56]


import java.util.Arrays;

public class SportsMeetSorting {

    // Print Array
    static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    // Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int swaps = 0;
        boolean alreadySorted = true;

        System.out.println("===== Bubble Sort =====");

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);

            if (!swapped)
                break;

            alreadySorted = false;
        }

        System.out.println("Total Swaps = " + swaps);
        System.out.println("Already Sorted? " + (alreadySorted ? "Yes" : "No"));
        System.out.println();
    }

    // Insertion Sort
    static void insertionSort(int[] arr) {
        int shifts = 0;

        System.out.println("===== Insertion Sort =====");
        
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                shifts++;
            }

            arr[j + 1] = key;

            System.out.print("Pass " + i + ": ");
            printArray(arr);
        }

        System.out.println("Total Shifts = " + shifts);
        System.out.println();
    }

    // Selection Sort
    static void selectionSort(int[] arr) {
        int swaps = 0;

        System.out.println("===== Selection Sort =====");

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swaps++;
            }

            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
        }

        System.out.println("Total Swaps = " + swaps);
        System.out.println();
    }

    // Top 3 Medalists
    static void top3(int[] arr) {
        System.out.println("===== Top 3 Medalists =====");

        int n = arr.length;

        System.out.println(" Gold   : " + arr[n - 1]);
        System.out.println(" Silver : " + arr[n - 2]);
        System.out.println(" Bronze : " + arr[n - 3]);
    }

    public static void main(String[] args) {

        int[] scores = {64, 25, 12, 22, 11, 45, 23, 44, 56, 56};

        int[] bubble = Arrays.copyOf(scores, scores.length);
        int[] insertion = Arrays.copyOf(scores, scores.length);
        int[] selection = Arrays.copyOf(scores, scores.length);

        bubbleSort(bubble);
        insertionSort(insertion);
        selectionSort(selection);

        // Use any sorted array
        top3(bubble);
    }
}