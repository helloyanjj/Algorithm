package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        getOrder(root, res);
        return res;
    }

    public void getOrder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }

        getOrder(node.left, res);
        res.add(node.val);
        getOrder(node.right, res);

    }

}
