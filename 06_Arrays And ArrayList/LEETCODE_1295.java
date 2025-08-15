public class LEETCODE_1295 {
    public static void main(String[] args) {
        
    }
    public class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m]; // rows ke liye count array
        int[] cols = new int[n]; // columns ke liye count array

        // Har index ke liye row aur column ko +1 count kar lo
        for (int[] index : indices) {
            rows[index[0]]++;
            cols[index[1]]++;
        }

        int count = 0;

        // Har cell ke liye check karo: rows[i] + cols[j]
        // Agar wo odd hai, to count++
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int val = rows[i] + cols[j];
                if (val % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}




/*

Start:      [[0 0 0],
             [0 0 0]]

After [0,1]: row 0 → +1 => [1 1 1]
             column 1 → +1 => [1 2 1], [0 1 0]

After [1,1]: row 1 → +1 => [1 2 1], [1 2 1]
             column 1 → +1 => [1 3 1], [1 3 1]


*/
}
