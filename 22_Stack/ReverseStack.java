// Reverse Stack Using Recursion

import java.util.*;

public class ReverseStack {
    public static void displayReverseRec(Stack <Integer> st){
        if(st.size() == 00) return ;
        int top = st.pop();
        System.out.print(top + " ");
        displayReverseRec(st);
        st.push(top);
        
        
    }
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.print("Reverse of the Stack is = ");
        displayReverseRec(st);
    }

}
