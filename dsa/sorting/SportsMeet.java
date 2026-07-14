import java.util.Arrays;

public class SportsMeet {

    static void bubbleSort(int[] arr) {

        int swaps = 0;

        System.out.println("Bubble Sort:");

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));

            if (!swapped) {
                System.out.println("Array already sorted.");
                break;
            }
        }

        System.out.println("Total Swaps = " + swaps);
        System.out.println();
    }

    static void insertionSort(int[] arr) {

        int swaps = 0;

        System.out.println("Insertion Sort:");

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
                swaps++;
            }

            arr[j + 1] = key;

            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Total Shifts = " + swaps);
        System.out.println();
    }

    static void selectionSort(int[] arr) {

        int swaps = 0;

        System.out.println("Selection Sort:");

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

                swaps++;
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));
        }

        System.out.println("Total Swaps = " + swaps);
        System.out.println();
    }

    static void top3(int[] arr) {

        System.out.println("Top 3 Medalists:");

        for (int i = arr.length - 1; i >= arr.length - 3; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] scores = {64, 25, 12, 22, 11, 45, 23, 44, 56, 56};

        bubbleSort(scores.clone());

        insertionSort(scores.clone());

        int[] sorted = scores.clone();
        selectionSort(sorted);

        top3(sorted);
    }
}
//A sports meet has 50 athletes with score.sort uding bubblesort,count total swaps,and flag if already sortd best case
//  repaet with insertionand selection sort find top 3 medalists.trace pass-by-pass changes on  
// array[64,25,12,22,11,45,23,44,56,56]
 
