package ArrayPracticeQuestions.level1;

public class StoreNum {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double sum = 0.0;
        int idx = 0;

        while (true) {
            System.out.print("Enter number: ");
            double val = sc.nextDouble();

            if (val <= 0 || idx == arr.length)
                break;

            arr[idx] = val;
            idx++;
        }

        // Display numbers  and their sum
        System.out.println("Numbers entered:");
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println("\nSum = " + sum);

        sc.close();
    }
    
}
