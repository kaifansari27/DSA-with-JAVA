public class IMPLEMENTATION {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0 ;

        // insert at tail or End

        void inserAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size ++;
        }

        // insert at Head in LL

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
                size ++;
            }
        }

        // Insert at Given Index ..

        void insertAt(int idx , int val){
            Node t = new Node(val);
            Node temp =head ;

            // case 1 - insert at end 

            if(idx == size){
                inserAtEnd(val);
                return ;
            }

            // case 2 - insert at Head

            if(idx == 0){
                insertAtHead(val);
                return;

            }

            // if you have Wrong index;

            else if( idx < 0 || idx > size){
                System.out.println("Wrong Index : ");
                return ;
            }

            for(int i = 1 ; i < idx - 1 ; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

        }

        // get function  for returnig the value of the nod....


        int getAt(int idx){

            if(idx < 0 || idx > size){
                System.out.println("Wrong Index: ");
                return-1;
            }
            Node temp = head ;
            for(int i = 0 ; i < idx  ; i++){
                temp = temp.next;
            }
            return temp.data;
        
        }

        // Delet At index..

        void deletAt(int idx){
            if (idx == 0 ){
                head = head.next;
                size--;
                return;
            }
            Node temp = head;

            for(int i=1 ; i < idx -1 ; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx == size - 1) tail = temp;
            size--;
        }

        // displaying linkedlist

        void display() {
            Node temp = head; 
            while (temp != null) {
                System.out.print(temp.data + " "); // 
                temp = temp.next;
            }
            System.out.println();
        }
 
    }

    
    //  insert at given index 
    
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtHead(21);
        ll.inserAtEnd(27);
        //ll.display();
        ll.inserAtEnd(69);
        //ll.display();
        ll.inserAtEnd(98);
        //ll.display();
        ll.insertAtHead(32);
        //ll.display();
        System.out.println("Size of the your LL is = " + ll.size);

        ll.insertAt(4 , 10);
        ll.insertAt(0, 100);
        ll.display();

        // if you want you find the size of the ll

        //System.out.println("Size of the your LL is = "+ll.size);
        //System.out.println("Data of the your Head is = "+ ll.head.data);
        //System.out.println("Data of the your Tail is = " + ll.tail.data);
        //System.out.println("Value of the your Node = "+ll.getAt(4));
        ll.deletAt(2);
        ll.display();
    }
}
