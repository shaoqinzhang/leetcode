import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class L215Kth_Largest_Element {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            queue.offer(Integer.valueOf(nums[i]));
        }
        int i = k;
        Integer result =null;
        while (i > 0) {
            result = queue.poll();
            i--;
        }
        return result;
    }
}
