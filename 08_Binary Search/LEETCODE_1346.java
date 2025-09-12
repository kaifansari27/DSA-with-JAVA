import java.util.HashSet;
import java.util.Set;

public class LEETCODE_1346 {
    public static void main(String[] args) {

    }

    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            // check if double exists OR half exists (only if even)
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}