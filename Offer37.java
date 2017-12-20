package JZhOffer;

/**
 * Created by ${ywj} on 2017/10/17.
 */
public class Offer37 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }

        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        int p1Length = getLength(p1);
        int p2Length = getLength(p2);


        if (p1Length >= p2Length) {
            int length = p1Length - p2Length;
            while (length > 0) {
                p1 = p1.next;
                length--;
            }
        } else if(p1Length < p2Length) {
            int length = p2Length - p1Length;
            while (length > 0) {
                p2 = p2.next;
                length--;
            }
        }
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public int getLength(ListNode pHead) {
        int length = 0;

        ListNode current = pHead;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
