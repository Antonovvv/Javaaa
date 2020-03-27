package toOffer;

/*输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 
 */
public class Solution16 {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        //注意不能用if (root2.val == root1.val) return AHasB(root1, root2);
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
