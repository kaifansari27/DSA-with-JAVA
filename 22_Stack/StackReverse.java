// Iterative Method Of Displaying Reverse Stack 

import java.util.*;
public class StackReverse {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(34);
        st.push(43);
        st.push(28);
        st.push(27);
        st.push(7);
        System.out.println("Original Stack = " + st);
        Stack <Integer> rt = new Stack<>();
        while( st.size() > 0 ){
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> gt = new Stack <> ();
        while( rt.size() > 0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
        while(gt.size() > 0){
            st.push(gt.pop());
        }
        System.out.println("This is Reverse of the Original Stack = " + st);

    }
}
