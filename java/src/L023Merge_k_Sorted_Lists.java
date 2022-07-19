import java.util.List;
import java.util.PriorityQueue;

public class L023Merge_k_Sorted_Lists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public class PriorityQueueNode implements Comparable<PriorityQueueNode> {
        public ListNode node;
        public PriorityQueueNode(ListNode node) {
            this.node = node;
        }

        @Override
        public int compareTo(PriorityQueueNode o) {
            return this.node.val-o.node.val;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<PriorityQueueNode> queue = new PriorityQueue<PriorityQueueNode>();
        int N = lists.length;
        for (ListNode node : lists) {
            if(node!=null)
                queue.offer(new PriorityQueueNode((node)));
        }
        ListNode head = null;
        if(!queue.isEmpty())
            head = queue.remove().node;

        if (head!=null&&head.next!=null)
            queue.offer(new PriorityQueueNode(head.next));
        ListNode ptr = head;
        while (!queue.isEmpty()) {
            ListNode node = queue.remove().node;
            ptr.next = node;
            ptr = node;
            if (node.next != null)
                queue.offer(new PriorityQueueNode(node.next));
        }
        return head;
    }
}

