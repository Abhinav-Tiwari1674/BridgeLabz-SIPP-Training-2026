import java.util.*;

class Solution {

    public int[] maxThroughputWindow(int[] readings, int k) {

        int n = readings.length;

        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!deque.isEmpty() &&
                    deque.peekFirst() <= i - k) {

                deque.pollFirst();
            }

            while (!deque.isEmpty() &&
                    readings[deque.peekLast()] <= readings[i]) {

                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {

                result[i - k + 1] =
                        readings[deque.peekFirst()];
            }
        }

        return result;
    }
}