
public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(2728));
    }
    static int sumOfDigit(int n ){
        if ( n == 0){
            return 0;
        }
        return (sumOfDigit(n/10) + (n %10 ));
    }
}

/*
       how it Internaly working 
      
       8 tumhara remaider hai... matlab last digit
      
      = 8 + sumOfDigit(272)
      = 8 + 2 + sumOfDigit(27)
      = 8 + 2 + 7 + sumOfDigit(2)
      = 8 + 2 + 7 + 2 + sumOfDigit(0)
      = 8 + 2 + 7 + 2 + 0 = 19 ✅

 */