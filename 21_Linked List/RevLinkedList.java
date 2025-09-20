 

public class RevLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void DispRec(Node head){
        if(head == null) return;
        DispRec(head.next);
        System.out.print(head.data + " ");

    }
    public static void main(String[]args){
        Node a = new Node(45);
        Node b = new Node(42);
        Node c = new Node(34);
        Node d = new Node(67);

        a.next = b;
        b.next = c;
        c.next= d;

        DispRec(a);

    }
}
