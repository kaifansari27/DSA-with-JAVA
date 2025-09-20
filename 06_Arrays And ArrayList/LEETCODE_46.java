import java.util.ArrayList;
import java.util.List;

public class LEETCODE_46 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList)); // store a copy
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue; // skip if already used
            used[i] = true;
            tempList.add(nums[i]); // choose
            backtrack(result, tempList, nums, used); // explore
            tempList.remove(tempList.size() - 1); // undo choice
            used[i] = false;
        }
    }
}
