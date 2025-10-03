public class DetectCycle{
    static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static boolean hasCycle(Node head){
        if(head == null || head.next == null) return false;
        Node slow = head ;
        Node fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }
    public static void Print(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[]args){
        Node head = new Node (10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next= new Node(40);
        
        // cycle bana diya 
        head.next.next.next.next= head.next;
        boolean result = hasCycle(head);
        System.out.println("has  Cycle : " + result);
    
    }
}