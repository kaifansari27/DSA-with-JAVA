public class LEETCODE_1854{
    public static void main(String[] args) {
        
    }
    class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] delta = new int[101];
        int offset = 1950;
        for (int[] log : logs) {
            delta[log[0] - offset]++;
            delta[log[1] - offset]--;
        }
        int max = 0, cur = 0, res = offset;
        for (int i = 0; i < delta.length; i++) {
            cur += delta[i];
            if (cur > max) {
                max = cur;
                res = offset + i;
            }
        }
        return res;
    }
}

}