public class DetectNode {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node detectNode(Node head){
        if(head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                Node temp = head;
                while(temp != slow){
                    temp = temp.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[]args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next= new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head.next.next;
        Node result = detectNode(head);
        System.out.println("Cycle is Start from Node: " + result.data);

    }
}
