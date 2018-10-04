package companyWrittenExamination;

public class TeatAdd {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int x = 0, y = 0, carry = 0,aa = 0;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode result = new ListNode(0);
        while (p1 != null || p2 != null) {
            x = (p1 != null) ? p1.val : 0;
            y = (p2 != null) ? p2.val : 0;
            int sum = x + y + aa;
            int cc = sum % 10;
            aa = sum / 10;
            result.val = cc;
            result = result.next;
            if(p1!=null)p1 = p1.next;
            if(p2!=null)p2 = p2.next;
        }
        return result;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
