import java.util.*;

public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<>();
        int n ; // i take the input
        
        System.out.println("Enter the number of Element : ");
        n = sc.nextInt();
        System.out.println("Enter the Element :");
        for(int i = 1 ; i <= n ; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        

    }
}
