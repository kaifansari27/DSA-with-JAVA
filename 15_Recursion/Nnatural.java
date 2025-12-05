public class Nnatural {
        public static void main(String[]args){
            System.out.println(natural(n));
            
        }
        public static int natural(int n ){
            int n = 5;
            if(n==0) return 0;
            return natural(n-1) + n;
        }
}