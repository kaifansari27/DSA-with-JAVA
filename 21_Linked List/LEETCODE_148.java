public class LEETCODE_148{
    public static class ListNode {

    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Base case: 0 or 1 node
        }

        // Step 1: Split the list into two halves
        ListNode mid = getMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        // Step 2: Recursively sort each half
        left = sortList(left);
        right = sortList(right);

        // Step 3: Merge the two sorted halves
        return merge(left, right);
    }

    // Function to find the middle node (for splitting)
    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next; // keep fast ahead

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // middle node
    }

    // Function to merge two sorted linked lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }
}