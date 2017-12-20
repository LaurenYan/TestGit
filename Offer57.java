package JZhOffer;

/**
 * Created by ${ywj} on 2017/11/22.
 */
/*这个是保留重复节点的删除节点*/
public class Offer57 {
    public static void main(String[] args){
        Offer57 o57 = new Offer57();
        ListNode ph = new ListNode(1);
        ListNode p1 = new ListNode(2);
        ph.next= p1;
        ListNode p2 = new ListNode(3);
        ph.next.next=p2;
        ListNode p3 = new ListNode(3);
        ph.next.next.next = p3;
        ListNode p4 = new ListNode(4);
        ph.next.next.next.next=p4;
        ListNode p5 = new ListNode(4);
        ph.next.next.next.next.next = p5;
        ListNode p6 = new ListNode(5);
        ph.next.next.next.next.next.next = p6;
        ListNode res = o57.deleteDuplication(ph);

    }
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return pHead;

        ListNode ln1 = pHead;
        ListNode ln2 = pHead.next;
        while (ln2 != null) {
            while (ln1.val != ln2.val) {
                if (ln2.next != null) {
                    ln1 = ln2;
                    ln2 = ln2.next;
                }else {
                    break;
                }
            }
            while (ln1.val == ln2.val) {
                while (ln2.next != null&&ln2.next.val==ln1.val) {
                    ln2 = ln2.next;
                }
                ln2 = ln2.next;
                ln1.next = ln2;
            }
            if(ln2==null||ln2.next==null)
                break;

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
