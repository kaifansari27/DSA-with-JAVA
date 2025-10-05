import java.util.*;

public class basicOfStack {
    public static void main(String[]args){
        Stack <Integer> st = new Stack <>();
        st.push(1);
        st.push(23);
        st.push(45);
        st.push(69);
        System.out.println(" Peek Element of the is Stack is = "+ st.peek()); // 69
        System.out.println(st); // [1, 23, 45, 69]
        st.pop();
        System.out.println(st); // [1, 23, 45]
        st.pop();
        System.out.println(st); // [1, 23]
        System.out.println("Size is =  " + st.size()); //  size is : 2

        // exessing Element of the Stack (we use loop --> [while])

        // exessing 1st element of the stack

        /*while(st.size()>1){
            st.pop();  
        }
        System.out.println("Element at place 1 = " + st.peek()); // [1] --> stack is permanent delete but it should be
        System.out.println(st);*/

        // exessing 2nd Element of the stakc

        while(st.size()> 2){
            st.pop();
        }
        System.out.println("Element at place 2 =" + st.peek()); // [1, 23]
        System.out.println(st);


    }
}