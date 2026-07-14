package TwoPointer_SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class longestSubarray {
    // Scenario 5: Variable Window — API Rate Limiter Window Adjustment
    public int longestSubarrayWithAtMostNDistinct(int[] keyIds, int n) {
        Map<Integer, Integer> freq = new HashMap<>();
        int start = 0, maxLen = 0;
        for (int end = 0; end < keyIds.length; end++) {
            freq.merge(keyIds[end], 1, Integer::sum);
            while (freq.size() > n) {
                int leftKey = keyIds[start];
                freq.put(leftKey, freq.get(leftKey) - 1);
                if (freq.get(leftKey) == 0) freq.remove(leftKey);
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        longestSubarray ls = new longestSubarray();
        int[] keyIds = {1, 2, 1, 2, 3};
        int n = 2;
        int result = ls.longestSubarrayWithAtMostNDistinct(keyIds, n);
        System.out.println("Length of the longest subarray with at most " + n + " distinct key IDs: " + result);
    }
}
