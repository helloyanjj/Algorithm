package jianzhiOffer;

/**
 * created by yanjunjie
 */

/**
 * 二叉树下一个节点
 * 找出中序遍历二叉树下一个节点
 */

class TreeNode {
    int value;
    TreeNode leftNode;
    TreeNode rightNode;
    TreeNode parentNode;
    TreeNode (int value) {
        this.value = value;
    }
}

public class GetNext {
    public static TreeNode getNext(TreeNode treeNode) {
        if (treeNode == null) {
            return null;
        }
        TreeNode nextNode = null;

        if (treeNode.rightNode != null) {
            TreeNode rightTree = treeNode.rightNode;
            while (rightTree.leftNode != null) {
                rightTree = rightTree.leftNode;
            }
            nextNode = rightTree;
        }else if (treeNode.parentNode != null) {
            TreeNode currentNode = treeNode;
            TreeNode parentNode = treeNode.parentNode;
            if (parentNode != null && currentNode == parentNode.rightNode) {
                currentNode = parentNode;
                parentNode = parentNode.parentNode;
            }
            nextNode = parentNode;
        }
        return nextNode;
    }
}

