package TwoPointer_SlidingWindow;
public class findPairSums{

    // Scenario 1: Pair Sum — Fraud Detection in Transaction Logs
    public int[] findPairSum(int[] transactions, int target) {
        int left = 0, right = transactions.length - 1;
        while (left < right) {
            int sum = transactions[left] + transactions[right];
            if (sum == target) return new int[]{transactions[left], transactions[right]};
            else if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        findPairSums fps = new findPairSums();
        int[] transactions = {1, 2, 3, 4, 5, 6};
        int target = 7;
        int[] pair = fps.findPairSum(transactions, target);
        if (pair[0] != -1) {
            System.out.println("Pair found: " + pair[0] + ", " + pair[1]);
        } else {
            System.out.println("No pair found that sums to " + target);
        }
    }
}