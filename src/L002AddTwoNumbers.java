public class L002AddTwoNumbers {


    public static void main(String args[]){
        ListNode p,q;
        ListNode root1 = new ListNode(2);
        q = new ListNode(4);
        root1.next = q;
        p = new  ListNode(3);
        q.next = p;

        ListNode root2 =  new ListNode(5);
        q = new ListNode(6);
        root2.next = q;
        p = new  ListNode(4);
        q.next = p;
        ListNode result = addTwoNumbers(root1,root2);
        show(root1);
        show(root2);
        show(result);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode p,q,r;
        ListNode result;
        int sum, c=0;
        p = l1;
        q = l2;
        result = new ListNode(0);
        r = result;
        while (p != null && q != null){
            sum = p.val+q.val+c;
            c = sum / 10;
            sum = sum % 10;
            r.next = new ListNode(sum);
            r = r.next;
            p = p.next;
            q = q.next;
        }
        while (p != null){
            sum = p.val+c;
            c = sum / 10;
            sum = sum % 10;
            r.next = new ListNode(sum);
            r = r.next;
            p = p.next;
        }
        while (q != null){
            sum = +q.val+c;
            c = sum / 10;
            sum = sum % 10;
            r.next = new ListNode(sum);
            r = r.next;
            q = q.next;
        }
        if (c==1)
            r.next = new ListNode(c);

        return result.next;
    }

    public static void show(ListNode root){
        while(root != null){
            System.out.print(root.val+" ");
            root = root.next;
        }
        System.out.println();
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x){ val = x;}
}
