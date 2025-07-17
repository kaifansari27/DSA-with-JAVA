 
public class ProdOfTwoNum {
   public static int prod(int num1 , int num2){
    int prod = num1 * num2 ;
    return prod ;
   }
   public static void main(String[] args) {
    int num1 = 20;
    int num2 = 3;
    int prod = prod(num1 , num2);
    System.out.println("a * b =  " + prod);
    prod = prod(20 , 5);
    System.out.println("A * B = " + prod);
   }

    
}
