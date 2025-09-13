public class LEETCODE_1217{
    public static void main(String[]args){

    }
    public int minCostToMoveChips(int[] chips) {
        int even = 0, odd = 0;
        
        for (int pos : chips) {
            if ((pos & 1) == 0) {  // even position
                even++;
            } else {               // odd position
                odd++;
            }
        }
        
        return Math.min(even, odd);
    }
}