import java.util.Scanner;
public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of elements : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements of the array:");
        String input = sc.nextLine();
        String[] strArr = input.trim().split("[,\\s]+");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i].trim());
        }
        boolean[] visited = new boolean[n];
        System.out.println("Frequency of elements:");
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }
}