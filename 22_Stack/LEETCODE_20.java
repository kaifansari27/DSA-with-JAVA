import java.util.*;

public class LEETCODE_20 {
    public static void main(String[] args) {
        
    }
    /*public boolean ValidParanthesis(String s){
        while (true){
            if(s.contains("()")){
                s = s.replace("()" , " ");
            }else if (s.contains("{}")){
                s = s.replace("{}", " ");
            }
            else if (s.contains("[]")){
                s = s.replace("[]" , " ");
            }
            else {
                return s.isEmpty();
            }
        }
    }*/

    // 2nd Method using Stack
    
    public boolean isValid(String s){
        Stack <Character> st = new Stack ;

        int n = s.length ;

        for (int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if( ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else{
                if(st.size() == 0) return false;

                char top = st.peek();

                if((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')){
                    st.pop();
                } else{
                    return false ;
                }

            }  
        }
        return st.isEmpty();
    }
}
