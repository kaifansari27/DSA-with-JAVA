public class LEETCODE_141{
    public static void main(String[]args){

    }
    public boolean hasCycle(ListNode head) {

        // this is base condition for LL is Exist or Not
        if (head == null || head.next == null) {
            return false;  
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         
            fast = fast.next.next;     

            if (slow == fast) {       
                return true;
            }
        }

        return false;  
    }
}