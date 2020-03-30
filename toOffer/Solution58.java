package toOffer;
import java.util.*;
/*��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ��
 * �ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�
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
