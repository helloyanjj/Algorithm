package leetcode;

public class LeetCode543 {

    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        deepRoot(root);
        return ans - 1;
    }

    public int deepRoot(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int L = deepRoot(root.left);
        int R = deepRoot(root.right);
        ans = Math.max(L + R + 1, ans);
        return Math.max(L, R) + 1;

    }
}
