 

public class nthNodefromEnd {

    // Method 1 for finding nth Node from the End.. 

    public static Node nthNode(Node head , int n){
        int size = 0 ;
        Node temp = head;
        while(temp != null){
            size ++;
            temp = temp.next;
        }
        int m = size - n + 1;

        // mth Node from the Start 

        temp = head; // temp ko head leke ayenge kyoki wo upar wale functio se null par chala gya tha
        for(int i = 1 ; i < m; i ++){
            temp= temp.next;
        }
        return temp;
    }

    // this is the Best Method for Findind Element from the End...

    public static Node nthNode2(Node head , int n){
        Node slow = head;
        Node fast = head;

        for(int i = 1 ; i <= n; i++){
            fast = fast.next;
        }

        while(fast!= null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node (100);
        Node b = new Node (13);
        Node c = new Node (4);
        Node d = new Node (5);
        Node e = new Node (12);
        Node f = new Node (10);

        a.next = b;
        b.next= c;
        c.next= d;
        d.next = e;
        e.next= f;
         

        //function call for displaying nth node.

        Node q = nthNode2(a, 4) ;// a = head     3 = mean nth node delete from last.
        System.out.println(q.data); 
    }
}
