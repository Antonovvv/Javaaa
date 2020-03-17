package toOffer;

import java.util.ArrayList;
import java.util.Queue;

import toOffer.TreeNode;

import java.util.LinkedList;
/*class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
/*�������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 */
public class Solution21 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> array = new ArrayList<Integer>();
        queue.offer(root);
        while (queue.peek() != null) {
            TreeNode node = queue.poll();
            array.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        return array;
    }
}
