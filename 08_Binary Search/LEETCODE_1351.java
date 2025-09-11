public class 1351{
    public static void main(String[]args){

    }
        public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        int row = 0, col = cols - 1;

        // Traverse matrix
        while (row < rows && col >= 0) {
            if (grid[row][col] < 0) {
                // Niche ke sab numbers iss column me negative honge
                count += rows - row;
                col--; // move left
            } else {
                row++; // move down
            }
        }

        return count;
    }

}