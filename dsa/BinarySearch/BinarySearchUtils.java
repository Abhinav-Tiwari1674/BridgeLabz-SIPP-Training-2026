public class BinarySearchUtils {

    // Standard Binary Search
    public int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // Search in Rotated Array
    public int searchRotated(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (target > arr[mid] && target <= arr[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }

    // First Occurrence
    public int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) { ans = mid; right = mid - 1; }
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return ans;
    }

    // Last Occurrence
    public int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) { ans = mid; left = mid + 1; }
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return ans;
    }

    // Minimum element in rotated array
    public int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) left = mid + 1;
            else right = mid;
        }
        return arr[left];
    }

    // Quick test
    public static void main(String[] args) {
        BinarySearchUtils bs = new BinarySearchUtils();
        int[] arr = {4,5,6,7,0,1,2};

        System.out.println("Binary Search (target=6): " + bs.binarySearch(arr, 6));
        System.out.println("Search Rotated (target=0): " + bs.searchRotated(arr, 0));
        System.out.println("First Occurrence (target=5): " + bs.firstOccurrence(arr, 5));
        System.out.println("Last Occurrence (target=5): " + bs.lastOccurrence(arr, 5));
        System.out.println("Minimum element: " + bs.findMin(arr));
    }
}

