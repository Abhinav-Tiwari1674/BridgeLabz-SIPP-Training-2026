import java.util.List;

class Utility {

    // Generic Method
    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for (T i : arr) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }

        return max;
    }

    // Wildcard Method
    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.print(obj + " ");
        }

        System.out.println();
    }
}