import java.lang.classfile.components.ClassPrinter.ListNode;

public class LEETCODE_160 {
    public static void main(String[] args) {
        
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        // A ka Length nikal lenge
        int lengthA = 0 ;
        while(tempA != null){
            lengthA++;
            tempA= tempA.next;
        }

        // ab B ki value find kar raha hu..

        int lengthB = 0 ;
        while(tempB != null){
            lengthB++;
            tempB= tempB.next;
        }

        // dono temp null par ja chuke h ab unhe wapas leke ayege

        tempA = headA;
        tempB = headB;

        // ab length ko campare karenge...

        if(lengthA > lengthB){
            int steps = lengthA - lengthB;
            for(int i= 0 ; i< steps ; i++){
                tempA = tempA.next;
            }
        }else{
            int steps = lengthB - lengthA;
            for(int i= 0 ; i< steps ; i++){
                tempB = tempB.next;
            }
        }
        //dono temp tab tak age badhayenge jab tak tempA and TemoB equal nhi ho jate

        while (tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;

        }
        // fir kisi ek ko return kar denge
        return tempA;
        
    }
}
