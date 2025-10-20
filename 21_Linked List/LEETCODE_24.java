import java.lang.classfile.components.ClassPrinter.ListNode;

public class LEETCODE_24 {
    public static void main(String[] args) {
        
    }
    public ListNode swapPairs(ListNode head) {
        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Swapping
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move to the next pair
            current = first;
        }

        return dummy.next;
    }

}
