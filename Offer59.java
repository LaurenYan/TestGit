package JZhOffer;

/**
 * Created by ${ywj} on 2017/12/11.
 */
public class Offer59 {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        return help(pRoot.left, pRoot.right);
    }

    private boolean help(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left != null && right != null) {

            return (left.val == right.val)
                    && help(left.left, right.right) && help(left.right, right.left);
        }
        return false;
    }


}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
