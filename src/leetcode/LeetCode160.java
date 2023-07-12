package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode160 {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        Set<ListNode> set = new HashSet<>();
        while (a.next != null) {
            set.add(a);
            a = a.next;
        }

        while (b.next != null) {
            if (set.contains(b)) {
                return b;
            }
            b = b.next;
        }
        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }
}
