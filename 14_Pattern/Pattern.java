
public class Pattern {
    public static void main(String[] args) {
        pattern9(4);
    }

    static void pattern1(int n) { // *
        for (int row = 1; row <= n; row++) { // * *
            for (int col = 1; col <= row; col++) { // * * *
                System.out.print("* ");
            }
            // adding new line
            System.out.println();
        }
    }

    static void pattern2(int n) { // * * *
        for (int row = 1; row <= n; row++) { // * *
            for (int col = 1; col <= n - row + 1; col++) { // *
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) { // * * * *
        for (int row = 1; row <= n; row++) { // * * * *
            for (int col = 1; col <= n; col++) { // * * * *
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) { // 1
        for (int row = 1; row <= n; row++) { // 1 2
            for (int col = 1; col <= row; col++) { // 1 2 3
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) { // *
        for (int row = 1; row <= 2 * n; row++) { // * *
            int totalColInRow = row > n ? 2 * n - row : row; // * * *
            for (int col = 1; col <= totalColInRow; col++) { // * * * *
                                                             // * * *
                System.out.print("* "); // * *
            } // *
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            int noOfSpace = n - totalColInRow;
            for (int s = 0; s < noOfSpace; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * patter6 output
     *
     * 
     * *
     * * *
     * * * *
     * * *
     * *
     * 
     * 
     */
    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) { // we print space with this line
                System.out.print("  ");  
            }
            for (int col = row; col >= 1; col--) { // we print numbers which is present in pattern
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        /*  
        Output Of the Pattern 7

          1  
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5
6 5 4 3 2 1 2 3 4 5 6

         */
    }
    static void pattern8(int n) {
        for (int row = 1; row <= 2*n; row++) {
            int c = row > n ? 2 * n - row : row ;
            for (int space = 0; space < n - c; space++) { // we print space with this line
                System.out.print("  ");  
            }
            for (int col = c; col >= 1; col--) { // we print numbers which is present in pattern
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    } 
    /*  Output of Pattern 8
          1 
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5
6 5 4 3 2 1 2 3 4 5 6
  5 4 3 2 1 2 3 4 5
    4 3 2 1 2 3 4
      3 2 1 2 3
        2 1 2
          1

     */
    
    static void pattern9(int n){
        int originalN = n ;
        n = 2 * n; 
        for(int row = 0 ; row <= n ; row++){
            for(int col = 0 ; col <= n ; col ++){
                int atEveryIndex = originalN - Math.min(Math.min(row , col ), Math.min(n- row , n - col ));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    /*

    Output of the Pattern 9
      
4 4 4 4 4 4 4 4 4 
4 3 3 3 3 3 3 3 4
4 3 2 2 2 2 2 3 4
4 3 2 1 1 1 2 3 4
4 3 2 1 0 1 2 3 4
4 3 2 1 1 1 2 3 4
4 3 2 2 2 2 2 3 4 
4 3 3 3 3 3 3 3 4
4 4 4 4 4 4 4 4 4

     */


     
}
