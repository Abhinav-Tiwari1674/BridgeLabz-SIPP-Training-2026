package JavaMethods.level2;

import java.util.Arrays;

public class RandomStats {
     // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000; // 1000–9999
        }
        return arr;
    }

    // Method to compute average, min, and max
    public static double[] findAverageMinMax(int[] nums) {
        int min = nums[0], max = nums[0], sum = 0;

        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
            sum += n;
        }

        double avg = sum * 1.0 / nums.length;
        return new double[]{ avg, min, max };
    }

    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);

        System.out.println("Generated Numbers: " + Arrays.toString(nums));

        double[] res = findAverageMinMax(nums);

        System.out.println("Average = " + res[0]);
        System.out.println("Min = " + res[1]);
        System.out.println("Max = " + res[2]);
    }
}
