public class L019RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;

//        作者：LeetCode
//        链接：https://leetcode-cn.com/problems/two-sum/solution/shan-chu-lian-biao-de-dao-shu-di-nge-jie-dian-by-l/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    }
    public static void main(String[] args){
        ListNode p,q;
        ListNode root1 = new ListNode(1);
        q = new ListNode(2);
        root1.next = q;
        p = new  ListNode(3);
        q.next = p;
        q=p;
        p = new  ListNode(4);
        q.next = p;
        q=p;
        p = new  ListNode(5);
        q.next = p;
        q=p;
        p = new  ListNode(6);
        q.next = p;
        show(root1);
        L019RemoveNthNodeFromEndofList a =new L019RemoveNthNodeFromEndofList();
        a.removeNthFromEnd(root1,2);
        show(root1);

    }
    public static void show(ListNode root){
        while(root != null){
            System.out.print(root.val+" ");
            root = root.next;
        }
        System.out.println();
    }

}
//class ListNode {
//   int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
// }