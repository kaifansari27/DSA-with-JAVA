
public class basicLL {

    // Diplaying Recursively 

    public static void displayRec( Node head){
        if(head == null) return ;
        System.out.print(head.data + " ");
        displayRec(head.next);
    }
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data= data;
        }
    }
    public static void main(String[]args){
        Node a = new Node(3);
        Node b = new Node(6);
        Node c = new Node(76);
        Node d = new Node(38);
        Node e = new Node(24);

        // now we are connecting node 

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // diplaying using for loop which is basic 

        /*
        Node temp = a;

        // for loop only work when you know size of the LL

        for(int i= 1 ; i < 5 ; i++){
            System.out.print(temp.data +" " );
            temp = temp.next;
        }*/
 

        /*
        
        // using while Loop

        Node temp = a ;
        while(temp != null){
            System.out.print(temp.data + " " );
            temp = temp.next;

        }*/

        // Displaying Recusively

        displayRec(a);
    }
}
