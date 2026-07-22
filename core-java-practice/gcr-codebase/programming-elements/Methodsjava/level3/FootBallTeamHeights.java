package JavaMethods.level3;

import java.util.Arrays;

public class FootBallTeamHeights {
     // Generate random heights in cms between 150 and 250
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; // 150–250
        }
        return heights;
    }

    // Find sum of all elements
    public static int findSum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    // Find mean of array
    public static double findMean(int[] numbers) {
        return (double) findSum(numbers) / numbers.length;
    }

    // Find shortest player
    public static int findShortest(int[] numbers) {
        int min = numbers[0];
        for (int n : numbers) {
            if (n < min) min = n;
        }
        return min;
    }

    // Find tallest player
    public static int findTallest(int[] numbers) {
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) max = n;
        }
        return max;
    }

    public static void main(String[] args) {
        final int TEAM_SIZE = 11;

        int[] heights = generateRandomHeights(TEAM_SIZE);
        System.out.println("Heights of players: " + Arrays.toString(heights));

        int sumHeights = findSum(heights);
        double meanHeight = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Sum of Heights = " + sumHeights);
        System.out.println("Mean Height = " + meanHeight);
        System.out.println("Shortest Player = " + shortest);
        System.out.println("Tallest Player = " + tallest);
    }
}
