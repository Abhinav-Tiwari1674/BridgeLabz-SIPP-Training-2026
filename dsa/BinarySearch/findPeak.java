package BinarySearch;

public class findPeak {
    public int findPeakElement(int[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] < arr[mid + 1]) left = mid + 1;
        else right = mid;
    }
    return left; // index of peak element
}

    public static void main(String[] args) {
        findPeak fp = new findPeak();
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = fp.findPeakElement(arr);
        System.out.println("Peak element index: " + peakIndex);
    }
}
