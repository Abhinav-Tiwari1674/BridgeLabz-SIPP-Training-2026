package TwoPointer_SlidingWindow;

public class maxSum {

    public int maxSubarrayOfSizeK(int[] cpuLoad, int k) {
        int windowSum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0;
        for (int end = 0; end < cpuLoad.length; end++) {
            windowSum += cpuLoad[end];
            if (end >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= cpuLoad[start];
                start++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        maxSum ms = new maxSum();
        int[] cpuLoad = {1, 3, 2, 5, 1, 1, 2};
        int k = 3;
        int result = ms.maxSubarrayOfSizeK(cpuLoad, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
    
}
