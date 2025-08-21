public class LEETCODE_566 {
    public static void main(String[] args) {

    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length; // original rows
        int n = mat[0].length; // original cols

        // Agar total elements match nahi karte, return original matrix
        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];
        int row = 0, col = 0;

        // Flatten and fill new matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return result;
    }
}
