public class LEETCODE_876{
    public static void main(String[]args){

    }
    /// maine esme right Middle wala Concept kara h jaha Head normal start hota h 
    public ListNode middleNode(ListNode head){
        ListNode slwo = head;
        ListNode fast = head;

        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow ;
        

    }

    
}