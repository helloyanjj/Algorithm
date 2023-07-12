package leetcode;

public class LeetCode21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode newList = new ListNode(-1);
        ListNode pre = newList;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                newList.next = l1;
                l1 = l1.next;
            }


            if (l1.val > l2.val) {
                newList.next = l2;
                l2 = l2.next;

            }
            pre = pre.next;
        }

        if (l1 != null) {
            pre.next = l1;

        }

        if (l2 != null) {
            pre.next = l2;

        }

        return pre;
    }
}
