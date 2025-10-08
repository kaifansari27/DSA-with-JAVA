import java.util.*;
public class StackUnderflow {
    public static void main(String[]args){
        Stack <Integer> st = new Stack <>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st); // [1, 2, 3, 4]
        st.pop();
        System.out.println(st); //[1, 2, 3]
        st.pop();
        System.out.println(st);// [1, 2]
        st.pop();
        System.out.println(st);// [1]
        st.pop();
        System.out.println(st); // [] -----> this is the Empty Stack
        st.pop(); // Error Occure..
        System.out.println(st);
    }
}




//  if Stack is Empty and you are trying to st.pop() and st.peek() then here occure "Empty stack Exeption"