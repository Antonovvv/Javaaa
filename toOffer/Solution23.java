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
/*����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����(ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
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
