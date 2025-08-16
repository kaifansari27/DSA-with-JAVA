public class LEETCODE_867 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[][] transpose(int[][] matrix) {
            int rows = matrix.length; // original matrix ki rows
            int cols = matrix[0].length; // original matrix ki columns

            // Transpose matrix banegi cols x rows ki
            int[][] result = new int[cols][rows];

            // Har element ko ulta (row<->col) daalna hai
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    // yaha pe ulta ho raha hai (i,j) -> (j,i)
                    result[j][i] = matrix[i][j];
                }
            }

            return result;
        }
    }

}
