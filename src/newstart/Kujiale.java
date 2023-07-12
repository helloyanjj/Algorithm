package newstart;

public class Kujiale {

    public static Boolean isCircle(Node node) {
        Node fast = node;
        Node low = node;
        while (fast != null && low != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;

            if (fast == low) {
                return true;
            }
        }

        return false;
    }


}

class Node {
    String value;
    Node next;
}
