public class PrintSubsequnce {
   public static void main(String[] args) {
        String s = "ABC";
        Subsequnce(s , 0 , " ");
   }
   public static void Subsequnce(String s , int index , String current) {
      if(index == s.length()){
         System.out.println(current);
         return;
      }
      Subsequnce(s , index+1 , current + s.charAt(index));
      Subsequnce(s , index+ 1 , current);
      

      
   }
}
