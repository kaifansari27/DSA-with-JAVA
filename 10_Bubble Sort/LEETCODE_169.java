import java.util.Arrays;

public class LEETCODE_169 {
    public static void main(String[] args) {

    }

    class Solution {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            return nums[n / 2];
        }
    }
}
