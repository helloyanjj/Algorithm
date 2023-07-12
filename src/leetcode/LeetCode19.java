package leetcode;

public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h = head;
        int len = 0;
        while (h != null) {
            h = h.next;
            len++;
        }
        int m = 0;
//        ListNode result = head;
        ListNode result = new ListNode(0, head);
        ListNode h2 = result;
        while (m < len - n) {
            h2 = h2.next;
            m++;
        }
        h2.next = h2.next.next;
        return result;

    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        int length = getLength(head);
        ListNode cur = dummy;
        for (int i = 1; i < length - n + 1; ++i) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

    public int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }

}
