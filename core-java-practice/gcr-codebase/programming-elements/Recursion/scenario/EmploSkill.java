import java.util.*;

class EmploSkill {

    static void team(int[] a, int i, int target,
                     ArrayList<Integer> list) {

        if (target == 0) {
            System.out.println(list);
            return;
        }

        if (i == a.length || target < 0) {
            return;
        }

        list.add(a[i]);
        team(a, i + 1, target - a[i], list);

        list.remove(list.size() - 1);
        team(a, i + 1, target, list);
    }

    public static void main(String[] args) {

        int[] a = {2, 3, 5, 7};
        int target = 10;

        team(a, 0, target, new ArrayList<>());
    }
}