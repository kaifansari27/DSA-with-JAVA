import java.lang.classfile.components.ClassPrinter.ListNode;

public class LEETCODE_21 {
    public static void main(String[] args) {
        
    }
    public class Solution{
        public ListNode mergeTwoList(ListNode list1 , ListNode list2){
            ListNode temp1 = list1;
            ListNode temp2 = list2;

            ListNode head = New ListNode(100) //new Node banaya jaha se values Attach karta jaunga

            ListNode temp = head ; // temp jo head ko represent kar raha h 

            while(temp1!= null && temp2 != null){
                if(temp1.val <temp2.val){
                    ListNode a = new ListNode(temp1.val); // less val ko attached kar diya
                    temp.next = a ;   // 100 ---> se choti wali vlaue ko attach kaar diya
                    temp = a;   // fir temp ko aa par la diya
                    temp1 = temp1.next;
                }
                else{
                    ListNode a = new ListNode(temp2.val);
                    temp.next = a;
                    temp = a;
                    temp2 = temp2.next;
                }
            
            }
            // ab tak both temp me se koi n koi null tak pahuch gya h ...
            if(temp1 == null){
                temp.next = temp2;
            }
            else{
                temp.next = temp1;
            }
            return head.next; // 100 return nahi hoga Original Sorted LL return hoga

        }
    }
}
