public class L206ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode p=head,cur=head.next,q=head.next.next;
        while(q!=null){
            cur.next = p;
            p = cur;
            cur = q;
            q = q.next;
        }
        cur.next=p;
        head.next = null;
        return cur;
    }
    public static void show(ListNode root){
        while(root != null){
            System.out.print(root.val+" ");
            root = root.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        ListNode p,q;
        ListNode root1 = new ListNode(1);
        q = new ListNode(2);
        root1.next = q;
        p = new ListNode(3);
        q.next = p;


        show(root1);
        L206ReverseLinkedList solution = new L206ReverseLinkedList();
        root1 = solution.reverseList(root1);
        show(root1);

    }
}
