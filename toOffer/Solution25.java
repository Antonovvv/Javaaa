package toOffer;

/*输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * 
 */
public class Solution25 {
	public TreeNode Convert(TreeNode pRootOfTree) {
        SortConvert(pRootOfTree, pRootOfTree.val);
        while (pRootOfTree.left != null) {
            pRootOfTree = pRootOfTree.left;
        }
        return pRootOfTree;
    }
    public TreeNode SortConvert(TreeNode root, int mid) {
        if (root.left != null) {
            TreeNode leftNode = SortConvert(root.left, root.val);
            root.left = leftNode;
            leftNode.right = root;
        }
        if (root.right != null) {
            TreeNode rightNode = SortConvert(root.right, root.val);
            root.right = rightNode;
            rightNode.left = root;
        }
        if (root.val < mid) {    //为左子树
            return root.right != null ? root.right : root;
        } else {    //为右子树
            return root.left !=null ? root.left : root;
        }
    }
}
