package toOffer;
import java.util.ArrayList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
/*输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */

public class Solution23 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> pathArray = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        FindOne(root, target, path, pathArray);
        return pathArray;
    }
    public void FindOne(TreeNode root, int target, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> pathArray) {
        if (root == null) return;
        path.add(root.val);
        if (root.val == target && root.left == null && root.right == null) {
            pathArray.add(path);
        }
        ArrayList<Integer> path2 = new ArrayList<Integer>(path);
        FindOne(root.left, target - root.val, path, pathArray);
        FindOne(root.right, target - root.val, path2, pathArray);
    }
}
