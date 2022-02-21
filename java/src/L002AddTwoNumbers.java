import java.util.HashMap;
public class L002AddTwoNumbers {
    public  class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode resHead = new ListNode(0);
        ListNode curr = resHead;
        while (l1 != null || l2 != null) {
            int temp = (l1 != null ? l1.val : 0) +
                       (l2 != null ? l2.val : 0) + c;
            curr.next = new ListNode(temp % 10);
            c = temp /10;
            curr = curr.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (c != 0) {
            curr.next = new ListNode(c);
        }
        return resHead.next;
    }
}
