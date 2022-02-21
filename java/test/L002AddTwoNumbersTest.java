import org.junit.Test;

import static org.junit.Assert.*;

public class L002AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        L002AddTwoNumbers.ListNode l1;
        l1 = buildList(new int[]{0});
        L002AddTwoNumbers.ListNode l2;
        l2 = buildList(new int[]{0});
        L002AddTwoNumbers.ListNode expect;
        expect = buildList(new int[]{0});

        assertTrue(isEquals(new L002AddTwoNumbers().addTwoNumbers(l1, l2), expect));
        l1 = buildList(new int[]{2, 4, 3});
        l2 = buildList(new int[]{5, 6, 4});
        expect = buildList(new int[]{7, 0, 8});
        assertTrue(isEquals(new L002AddTwoNumbers().addTwoNumbers(l1, l2), expect));
        l1 = buildList(new int[]{9, 9, 9, 9, 9, 9, 9});
        l2 = buildList(new int[]{9, 9, 9, 9});
        expect = buildList(new int[]{8, 9, 9, 9, 0, 0, 0, 1});
        assertTrue(isEquals(new L002AddTwoNumbers().addTwoNumbers(l1, l2), expect));

    }

    public L002AddTwoNumbers.ListNode buildList(int[] nums) {
        L002AddTwoNumbers.ListNode list = new L002AddTwoNumbers().new ListNode(0);
        L002AddTwoNumbers.ListNode curr = list;
        for (int n : nums) {
            curr.next = new L002AddTwoNumbers().new ListNode(n);
            curr = curr.next;
        }
        return list.next;
    }

    public void show(L002AddTwoNumbers.ListNode l1) {
        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }

    public boolean isEquals(L002AddTwoNumbers.ListNode l1, L002AddTwoNumbers.ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null || l2 != null) {
            return false;
        }
        return true;
    }
}