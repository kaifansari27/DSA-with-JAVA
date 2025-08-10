public class LEETCODE_1572 {
    public static void main(String[] args) {
        
    }
    public int diagonalSum(int[][] mat){
        int sum = 0;
        int n = mat.length;
        // finding sum of both Digonals..
        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; // sum of the left Digonals
            sum += mat[i][n - i -1]; // sum of the right Digonals            
        }
        //if the no of row in odd then element will be overlap then we remove that elements
        if( n % 2!= 0){
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }
}
