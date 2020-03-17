package toOffer;

/*����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
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
        if (root.val < mid) {    //Ϊ������
            return root.right != null ? root.right : root;
        } else {    //Ϊ������
            return root.left !=null ? root.left : root;
        }
    }
}
