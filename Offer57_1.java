package JZhOffer;

/**
 * Created by ${ywj} on 2017/11/22.
 */
public class Offer57_1 {
    public static void main(String[] args) {
        Offer57_1 o57 = new Offer57_1();
        ListNode ph = new ListNode(1);
        ListNode p1 = new ListNode(2);
        ph.next = p1;
        ListNode p2 = new ListNode(3);
        ph.next.next = p2;
        ListNode p3 = new ListNode(3);
        ph.next.next.next = p3;
        ListNode p4 = new ListNode(4);
        ph.next.next.next.next = p4;
        ListNode p5 = new ListNode(4);
        ph.next.next.next.next.next = p5;
        ListNode p6 = new ListNode(5);
        ph.next.next.next.next.next.next = p6;
        ListNode res = o57.deleteDuplication(ph);

    }

    private ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return pHead;
        if (pHead.val == pHead.next.val) {
            int temp = pHead.val;
            int temp2 = pHead.val;
            while (pHead.next != null && pHead.next.val == temp) {
                pHead = pHead.next.next;
                if (pHead == null)
                    return pHead;
                temp = pHead.val;
            }
            if (pHead.next == null && pHead.val == temp2) {
                return null;
            }

        }
        ListNode p1 = pHead;
        ListNode p2 = pHead.next;
        while (p2 != null) {
            int tmp = p2.val;
            if (p2.next != null && p2.next.val == tmp) {
                p2 = p2.next.next;
            }
            else {
                p1.next=p2;
                p1=p2;
                p2=p2.next;
            }
            if (p2 == null) {
                p1.next=p2;
            }
        }
        return pHead;
    }

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
