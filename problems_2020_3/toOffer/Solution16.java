package toOffer;

/*�������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 * 
 */
public class Solution16 {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        //ע�ⲻ����if (root2.val == root1.val) return AHasB(root1, root2);
        return AHasB(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }
    public static boolean AHasB(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root2.val == root1.val) {
            return AHasB(root1.left, root2.left) && AHasB(root1.right, root2.right);
        }
        return false;
    }
}
