// balacing Bracket in Stacks

import java.util.*;


public class balancedBrackets {
    public static boolean isBalanced(String str){
        Stack <Character> st = new Stack<>();
        int n = str.length();
        for(int i = 0 ; i < n ; i++){
            char ch = str.charAt(i); // iterate Char in string
            if(ch == '('){
                st.push(ch);
            }
            else{ // ch == ')'
                if(st.size() ==0) return false;
                if(st.peek()=='(') st.pop(); //mean agar peek par ( ye hota h to esko remove karte hai
            }
        }
        if(st.size()>0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bracket You need : ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
