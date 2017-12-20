package JZhOffer;

/**
 * Created by ${ywj} on 2017/11/15.
 */
public class Offer56 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null || pHead.next.next == null) {
            return null;
        }
        ListNode l1 = pHead;

        ListNode l2 = pHead.next.next;

        while (l1.val != l2.val) {
            if(l2.next!=null&&l2.next.next!=null){
                l1 = l1.next;
                l2 = l2.next.next;
            }
            else{
                return null;
            }
        }
        l1 = pHead;
        while (l1.val != l2.val) {
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}