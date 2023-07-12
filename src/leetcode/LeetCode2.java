package leetcode;

public class LeetCode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1);
        ListNode pre = node;
        int m = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val;
            ListNode temp;
            sum = sum + m;
            if (sum >= 10) {
                temp = new ListNode(sum % 10);
                m = sum / 10;
            } else {
                m = 0;
                temp = new ListNode(sum);
            }

            pre.next = temp;
            pre = temp;
            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode l = null;
        if (l1 != null) {
            l = l1;
        }

        if (l2 != null) {
            l = l2;
        }

        while (l != null) {
            int sum = l.val + m;
            ListNode temp;
            sum = sum + m;
            if (sum >= 10) {
                temp = new ListNode(sum % 10);
                m = sum / 10;
            } else {
                m = 0;
                temp = new ListNode(sum);
            }

            pre.next = temp;
            pre = temp;
            l = l.next;
        }
        if (m != 0) {
            pre.next = new ListNode(m);
        }

        return node.next;

    }
}
