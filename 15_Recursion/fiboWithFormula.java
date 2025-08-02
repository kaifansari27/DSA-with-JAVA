public class fiboWithFormula {
    public static void main(String[] args) {
        for(int i = 0 ; i < 11 ; i++ ){
            System.out.print(fiboFormula(i) + " ");
        }
        
    }
    static int fiboFormula(int n ){
        return(int)((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1- Math.sqrt(5)) / 2), n)) /  Math.sqrt(5)) ;
    }
    static int fib(int n ){
        if (n < 2){
            return n ; 
        }
        return fib(n-1) + fib(n-2);

    }
}
