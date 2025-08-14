public class LEETCODE_832 {
    public static void main(String[] args) {
        
    }
    class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       for(int[] row : image) {
        // reversing Arrays
        for(int i= 0 ; i < (image[0].length + 1) / 2 ; i ++){
            //swap
            int temp = row[i] ^ 1;
            row[i] = row[image[0].length-i-1] ^ 1;
            row[image[0].length-i-1] = temp;

        }
        
        
       }
       return image;
    }
}

/*



second way to print 


class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                // Swap and invert in one line
                int temp = row[i] ^ 1;
                row[i] = row[row.length - 1 - i] ^ 1;
                row[row.length - 1 - i] = temp;
            }
        }
        return image;
    }
}*/

}
