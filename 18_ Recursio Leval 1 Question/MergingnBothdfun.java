
public class MergingnBothdfun {
    public static void main(String[] args) {
        funBoth(5);
    }
    static void fun1(int n ){
        if(n == 0 ){
            return ;
        }
        System.out.print(n);
        fun1(n-1);
        
    }
    static void fun2(int n ){
        if(n == 0){
            return;
        }
        fun2(n-1);
        System.out.print(n);
    }
    static void funBoth(int n ){
        if( n == 0 ){
            return ;
        }
        System.out.print(n + " ");
        funBoth(n-1);
        System.out.print(n + " ");
    }
}
