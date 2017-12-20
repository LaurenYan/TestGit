package JZhOffer;

/**
 * Created by ${ywj} on 2017/12/8.
 */
public class Offer58 {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode.right != null){
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        }

        else{
            if (pNode.next != null && pNode.next.left == pNode) {
                return pNode.next;
            }
            if (pNode.next != null && pNode.next.right == pNode) {
                while (pNode.next.next != null) {
                    pNode = pNode.next;
                    if(pNode.next.left == pNode){
                        return pNode.next;
                    }
                }
            }

        }
        return null;
    }


}
