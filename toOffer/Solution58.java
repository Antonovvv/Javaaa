package toOffer;
import java.util.*;
/*请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class Solution58 {
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) return res;
        Stack<TreeNode> stackCurrent = new Stack<>(), stackNext = new Stack<>(), tmp;
        int count = 1;
        stackCurrent.push(pRoot);
        while (!stackCurrent.empty() || !stackNext.empty()) {
            ArrayList<Integer> layer = new ArrayList<>();
            while (!stackCurrent.empty()) {
                TreeNode node = stackCurrent.pop();
                layer.add(node.val);
                if (count % 2 == 1) {
                    if (node.left != null) stackNext.push(node.left);
                    if (node.right != null) stackNext.push(node.right);
                } else {
                    if (node.right != null) stackNext.push(node.right);
                    if (node.left != null) stackNext.push(node.left);
                }
            }
            count++;
            res.add(layer);
            tmp = stackCurrent; stackCurrent = stackNext; stackNext = tmp;
        }
        return res;
    }
}
