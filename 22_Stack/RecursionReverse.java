import java.util.*;

public class RecursionReverse {
    public static void pushAtBottom(Stack <Integer> st , int x ){
        // base case ..
        if(st.size() == 0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    // reverse Function

    public static void reverse (Stack <Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
    public static void main(String[]args){
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack = " + st);
        reverse(st);
        System.out.println("Stack After Reverse = " + st);
    }
}
