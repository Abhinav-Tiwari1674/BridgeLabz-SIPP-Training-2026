package BinarySearch;

public class FindRotaionPoints {
    public int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) left = mid + 1;
            else right = mid;
        }
        return left; // index of smallest element
   }
   public static void main(String[] args) {
        FindRotaionPoints frp = new FindRotaionPoints();
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int rotationPoint = frp.findRotationPoint(arr);
        System.out.println("Rotation point index: " + rotationPoint);
    }
}

    

