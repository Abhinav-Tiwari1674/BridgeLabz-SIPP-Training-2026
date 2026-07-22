//  Extend: given daily stock prices, compute Next 
// Greater Price for each day (O(n) monotonic stack). Calculate stock 
// span (how many consecutive previous days price was ≤ today)



public class StockPrices{

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] nextGreater = nextGreaterPrice(prices);
        System.out.println("Next Greater Prices: ");
        for (int price : nextGreater) {
            System.out.print(price + " ");
        }
        System.out.println();
        int[] span = stockSpan(prices);
        System.out.println("Stock Span: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
    public static int[] nextGreaterPrice(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= prices[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(prices[i]);
        }
        return result;
    }
    public static int[] stockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        return span;
    }
    
}


