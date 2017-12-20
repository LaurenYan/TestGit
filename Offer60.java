package JZhOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by ${ywj} on 2017/12/18.
 */
public class Offer60 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        int layer = 1;
        //s1存放奇数层的节点
        Stack<TreeNode> s1 = new Stack<>();
        //存入根节点
        s1.add(pRoot);
        //s2存放偶数层的节点
        Stack<TreeNode> s2 = new Stack<>();
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        while (!s1.empty() || !s2.empty()) {
            if (layer % 2 != 0) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s1.empty()) {
                    TreeNode tNode = s1.pop();
                    if (tNode != null) {
                        temp.add(tNode.val);
                        s2.push(tNode.right);
                        s2.push(tNode.left);
                    }
                }
                if (!temp.isEmpty()) {
                    al.add(temp);
                    layer++;
                }
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s2.empty()) {
                    TreeNode tNode = s2.pop();
                    if (tNode != null) {
                        temp.add((tNode.val));
                        s1.push(tNode.left);
                        s1.push(tNode.right);
                    }
                }
                if (!temp.isEmpty()) {
                    al.add(temp);
                    layer++;
                }
            }
        }
        return al;
    }
}
