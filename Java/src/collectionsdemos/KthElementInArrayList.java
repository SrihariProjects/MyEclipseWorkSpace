package collectionsdemos;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KthElementInArrayList {

    public static void main(String[] args) {

        // Initialize ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        al.add(112);
        al.add(13);
        al.add(51);
        al.add(87);
        
        int k = 3; // Find the 3rd largest element
        
        // PriorityQueue to store elements in natural order (min-heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        
        // Add elements to the PriorityQueue
        for (Integer x : al) {
            pq.add(x);
            
            // If the size of the priority queue exceeds k, remove the smallest element
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        // The root of the priority queue will be the Kth largest element
        System.out.println(k + "th largest element is: " + pq.peek());
    }
    
}
