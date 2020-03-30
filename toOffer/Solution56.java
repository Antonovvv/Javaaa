package toOffer;
/*����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
 * ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
 */
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class Solution56 {
	public TreeLinkNode GetNext1(TreeLinkNode pNode)
    {
        if (pNode.next != null) {
            if (pNode == pNode.next.left) {
                if (pNode.right != null) return GetFirst(pNode.right);
                else return pNode.next;
            } else if (pNode == pNode.next.right) {
                if (pNode.right != null) return GetFirst(pNode.right);
                else {
                    while (pNode.next != null && pNode == pNode.next.right) pNode = pNode.next;
                    return pNode.next;
                }
            }
        } else {
            if (pNode.right != null) return GetFirst(pNode.right);
            else return null;
        }
        return null;
    }
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode.right != null) {
        	return GetFirst(pNode.right);
        } else {
        	while (pNode.next != null) {
        		if (pNode == pNode.next.right) pNode = pNode.next;
        		else break;
        	}
        	return pNode.next;
        }
    }
    public TreeLinkNode GetFirst(TreeLinkNode root) {
        if (root == null) return null;
        if (root.left != null) return GetFirst(root.left);
        else return root;
    }
}
