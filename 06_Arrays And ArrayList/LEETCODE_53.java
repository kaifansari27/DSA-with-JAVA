public class LEETCODE_53 {
    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0]; // stores maximum sum found so far
        int currentSum = nums[0]; // stores current running sum

        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray OR start new from current element
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }
}
