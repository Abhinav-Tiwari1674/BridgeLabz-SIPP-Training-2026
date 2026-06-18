package rec_pract;


import java.util.*;

public class allSubset {

    static void subset(int[] a, int i, ArrayList<Integer> list) {

        if (i == a.length) {
            System.out.println(list);
            return;
        }

        // include
        list.add(a[i]);
        subset(a, i + 1, list);

        // backtrack
        list.remove(list.size() - 1);

        // exclude
        subset(a, i + 1, list);
    }

    public static void main(String[] args) {

        int[] a = {1, 2};

        subset(a, 0, new ArrayList<>());
    }
}
