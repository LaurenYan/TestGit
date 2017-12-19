package JZhOffer;

import java.util.*;

/**
 * Created by ${ywj} on 2017/12/19.
 */
public class Offer61 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        //存放一层节点的的队列
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        //存放q1的子节点
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();

        q1.add(pRoot);

        while (!q1.isEmpty()||!q2.isEmpty()) {
            if (!q1.isEmpty()) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!q1.isEmpty()) {
                    TreeNode tNode = q1.poll();
                    if (tNode != null) {

                        temp.add(tNode.val);
                        if (tNode.left != null) {
                            q2.add(tNode.left);
                        }
                        if (tNode.right != null) {
                            q2.add(tNode.right);
                        }
                    }
                }
                if (!temp.isEmpty()) {
                    res.add(temp);
                }
            }
            if (!q2.isEmpty()) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!q2.isEmpty()) {
                    TreeNode tNode = q2.poll();
                    if (tNode != null) {

                        temp.add(tNode.val);
                        if (tNode.left != null) {
                            q1.add(tNode.left);
                        }
                        if (tNode.right != null) {
                            q1.add(tNode.right);
                        }
                    }
                }
                if (!temp.isEmpty()) {
                    res.add(temp);
                }
            }
        }

        return res;
    }
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}

