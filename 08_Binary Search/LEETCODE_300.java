import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LEETCODE_300 {
    public static void main(String[] args) {

    }

    public int lengthOfLIS(int[] nums) {
        // list will store the smallest tail of increasing subsequence of length i+1
        List<Integer> sub = new ArrayList<>();

        for (int num : nums) {
            int i = Collections.binarySearch(sub, num);
            if (i < 0)
                i = -(i + 1); // position to insert
            if (i == sub.size()) {
                sub.add(num); // new biggest element
            } else {
                sub.set(i, num); // replace existing
            }
        }

        return sub.size();
    }
}
