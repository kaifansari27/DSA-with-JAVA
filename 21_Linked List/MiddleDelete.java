public class MiddleDelete {
    static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node middleDelete(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // deleting middle Element of the LL
        slow.next = slow.next.next;
        return head;
    }
    // now mai LL ko print kar raha hu.......
    public static void printList(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[]args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println("Original List: " + " ");
        printList(head);
        head = middleDelete(head);
        System.out.println("After the deleting LL " + " ");
        printList(head);
    }

}
