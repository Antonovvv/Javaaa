package toOffer;

/*���������Ķ�����������任ΪԴ�������ľ���
 * 
 */
public class Solution17 {
	public void Mirror(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
}
