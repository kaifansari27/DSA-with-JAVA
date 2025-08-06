public class SquarRootBS {
    public static void main(String[] args) {
        int n = 40 ;
        int p = 3;
        System.out.printf("%.3f", sqrt(n , p));
    }
    public static double sqrt(int n, int p ){

        // Applying simple Binary Seacrh...
        int s = 0;
        int e = n;
        double root = 0.0;
        while( s <= e){
            int m = s + ( e - s) / 2 ;
            if( m*m == n){
                return m;
            }
            if(m * m > n){
                e = m - 1;
            }else{
                s = m + 1 ;
            }
        }
        // for printing decimal values....
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /=10;
        }
        return root;
    }
}
