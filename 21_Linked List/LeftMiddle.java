public class LeftMiddle {
    static class Node {
        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node leftmiddle(Node head){
        if(head == null || head.next==null) return head;

        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[]args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        Node mid = leftmiddle(head);
        System.out.println("Middle Element is : " + mid.data);
    }
}
