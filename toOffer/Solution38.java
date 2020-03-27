package toOffer;
/*����һ�ö��������жϸö������Ƿ���ƽ���������
 * 
 */
public class Solution38 {
	public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
        return IsBalanced(root) != -1;
    }
    public int IsBalanced(TreeNode root) {
        if (root == null) return 0;
        int left = IsBalanced(root.left), right = IsBalanced(root.right);
        if (left == -1 || right == -1) return -1;
        if (left - right < -1 || left - right > 1) return -1;
        return Math.max(left, right) + 1;
    }
}
