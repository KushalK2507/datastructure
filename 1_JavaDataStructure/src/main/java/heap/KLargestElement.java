package heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KLargestElement {

    public static void main(String[] args) {

        System.out.println("Result = "+findKthLargest(new int[]{3,2,3,1,2,4},4));

    }

    public static int findKthLargest(int[] nums, int k) {

        Queue<Integer> elements = new PriorityQueue<>();
        for (int num : nums) {

            elements.offer(num);

            if (elements.size() > k) {
                elements.poll();
            }


        }

        return elements.poll();

    }
}
