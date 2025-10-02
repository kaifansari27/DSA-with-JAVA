import java.lang.classfile.components.ClassPrinter.ListNode;

public class LEETCODE_2095 {
    public static void main(String[] args) {
        
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next
        }
        slow.next==slow.next.next;
        return head;

    }
}
