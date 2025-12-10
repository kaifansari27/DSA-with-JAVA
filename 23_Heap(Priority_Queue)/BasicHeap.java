import java.util.*;
public class BasicHeap {
    public static void main(String[] args){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>() ;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        minHeap.add(5);
        minHeap.add(10);
        minHeap.add(1);

        maxHeap.add(7);
        maxHeap.add(18);
        maxHeap.add(25);
        // Pinting min and max Heap...
        System.out.println(minHeap + " ");
        System.out.println(maxHeap + " ");

        // now Printing peek Elements of the min and max heap..

        System.out.println("Peek Element of the min Heap = " + minHeap.peek() + " ");
        System.out.println("Peek Element of the max Heap = " + maxHeap.peek() + " ");

        // remove operation..

        minHeap.remove(1);
        System.out.println(minHeap );
        maxHeap.remove(25);
        System.out.println(maxHeap);




    }
}
