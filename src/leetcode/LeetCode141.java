package leetcode;

public class LeetCode141 {
    public boolean hasCycle(ListNode head) {

        ListNode fast = head, slow = head;
        while (fast != null && slow != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;

    }
}
