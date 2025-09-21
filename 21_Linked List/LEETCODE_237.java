import java.lang.classfile.components.ClassPrinter.ListNode;

public class LEETCODE_237 {
    public static void main(String[] args) {
        
    }
    public void deleteNode(ListNode node) {

    // pahle age wale node ki value ko piche wale node me dala 
        node.val = node.next.val;
        // ab us node ke value ko delete kiya ..
        node.next= node.next.next;
        
    }
}
