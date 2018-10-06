package jianzhiOffer;

/**
 * created by yanjunjie
 */

class BinaryTreeNode {
    public int value;
    public BinaryTreeNode leftNode;
    public BinaryTreeNode rightNode;
    public BinaryTreeNode () {

    }

    public BinaryTreeNode (int value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }
}

public class ConstructBinaryTree {
    public BinaryTreeNode reConstructBinaryTree(int []pre,int[] in) {
        if (pre==null || in==null || pre.length != in.length) {
            return null;
        } else {
            return reBulidTree(pre,0,pre.length-1,in,0,in.length-1);
        }
    }

    private BinaryTreeNode reBulidTree(int[] pre, int startPre, int endPre,
                                       int[] in, int startIn, int endIn) {
        if (startPre>endPre || startIn>endIn) {
            return null;
        }
        int root = pre[startPre];//数组的开始位置的元素是跟元素
        int locateRoot = locate(root,in,startIn,endIn);//得到根节点在中序数组中的位置 左子树的中序和右子树的中序以根节点位置为界
        if (locateRoot == -1) {//在中序数组中没有找到跟节点，则返回空
            return null;
        }
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(locateRoot);
        binaryTreeNode.leftNode = reBulidTree(pre,startPre+1,startPre+locateRoot-startIn,in,startIn,locateRoot-1);//递归构建左子树
        binaryTreeNode.rightNode = reBulidTree(pre,startPre+locateRoot-startIn+1,endPre,in,locateRoot+1,endIn);
        return binaryTreeNode;
    }

    //找到根节点在中序数组中的位置，根节点之前的是左子树的中序数组，根节点之后的是右子树的中序数组
    private int locate(int root, int[] in, int startIn, int endIn) {
        for (int i=startIn;i<endIn;i++) {
            if(root == in[i]) {
                return i;
            }
        }
        return -1;
    }
}

