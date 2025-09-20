public class INSERTATEND {
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

        // insert at tail or End
        void inserAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        // insert at Head in LL
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
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

        // displaying the size of the LL
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtHead(21);
        ll.inserAtEnd(27);
        ll.display();
        ll.inserAtEnd(69);
        ll.display();
        ll.inserAtEnd(98);
        ll.display();
        ll.insertAtHead(32);
        ll.display();
        System.out.println("Size of the your LL is = " + ll.size());
    }
}
