package toOffer;
import java.util.*;
/*从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * 
 */
public class Solution59 {
	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) return res;
        Queue<TreeNode> q1 = new LinkedList<>(), q2 = new LinkedList<>(), tmp;
        q1.offer(pRoot);
        while (!q1.isEmpty() || !q2.isEmpty()) {
            ArrayList<Integer> layer = new ArrayList<>();
            while (!q1.isEmpty()) {
                TreeNode node = q1.poll();
                layer.add(node.val);
                if (node.left != null) q2.offer(node.left);
                if (node.right != null) q2.offer(node.right);
            }
            res.add(layer);
            tmp = q1; q1 = q2; q2 = tmp;
        }
        return res;
    }
	ArrayList<ArrayList<Integer>> Print1(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(pRoot);
        while (!q.isEmpty()) {
            ArrayList<Integer> layer = new ArrayList<>();
            int end = q.size();
            for (int i = 0; i < end; i++) {
                TreeNode node = q.poll();
                layer.add(node.val);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            res.add(layer);
        }
        return res;
    }
}
