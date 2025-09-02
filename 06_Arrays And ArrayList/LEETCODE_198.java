public class LEETCODE_198 {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        // If there's only one house, rob it (no other choice)
        if (nums.length < 2) {
            return nums[0];
        }

        // Create a dp array to store the maximum money that can be robbed up to each
        // house
        int[] dp = new int[nums.length];

        // Base cases:
        dp[0] = nums[0]; // Only one house to rob
        dp[1] = Math.max(nums[0], nums[1]); // Rob the house with more money between the first two

        // Fill the dp array using the recurrence relation:
        // For each house, decide whether to rob it (and add its value to dp[i-2]) or
        // skip it (take dp[i-1])
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        // The last element of dp contains the maximum money that can be robbed
        return dp[nums.length - 1];
    }
}
