package problems_2020_3;

import java.util.Arrays;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}

/*����ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�*/
public class Solution3 {
	public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre.length == 0 || in.length == 0) return null;
		TreeNode tree = new TreeNode(pre[0]);
		for (int i = 0; i < in.length; i++) {
			if (in[i] == pre[0]) {
				tree.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
				tree.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
			}
		}
		return tree;
	}
	
	public static void preOrderTraversal(TreeNode tree) {
		if (tree != null) {
			System.out.print(tree.val + " ");
			preOrderTraversal(tree.left);
			preOrderTraversal(tree.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre = new int[] {1,2,4,3,5,6};
		int[] in = new int[] {4,2,1,5,3,6};
		preOrderTraversal(reConstructBinaryTree(pre, in));
	}

}
