// Linked List Implementation of Stack
public class LLimplementation {
    public static class Node { // user defined Data Type
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LLStack { // User defined Structure
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x = head.val; // save that value Which is we want to detele;
            head = head.next;
            size--;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty ! ");
                return -1;
            }
            return head.val;
        }
        void displayRec(Node h){
            if(h == null) return;
            displayRec(h.next);
            System.out.print(h.val + " ");
        }
        void displayRev(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
            }
        }
        void display(){
            displayRec(head);
            System.out.println();
        }

        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4); 
        st.display();  // 4
        st.push(5);
        st.display();  // 4 5
        st.push(1);
        st.display();  // 4 5 1
        System.out.println(st.size()); // 3
        st.pop();
        st.display(); // 4 5 
        System.out.println(st.size()); // 2
        st.push(3); 
        st.push(6);  
        st.display(); // 4 5 3 6
         
        

    }

}
