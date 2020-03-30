package toOffer;
/*��ʵ�������������ֱ��������л��ͷ����л�������
�����������л���ָ����һ�ö���������ĳ�ֱ�����ʽ�Ľ����ĳ�ָ�ʽ����Ϊ�ַ�����
�Ӷ�ʹ���ڴ��н��������Ķ��������Գ־ñ��档���л����Ի����������򡢺��򡢲���Ķ�����������ʽ�������޸ģ�
���л��Ľ����һ���ַ��������л�ʱͨ�� ĳ�ַ��ű�ʾ�սڵ㣨#������ �� ��ʾһ�����ֵ�Ľ�����value!����
�������ķ����л���ָ������ĳ�ֱ���˳��õ������л��ַ������str���ع���������
*/
public class Solution60 {
	private String[] serialStrings;
    private int index = -1;
    String Serialize(TreeNode root) {
        if (root == null) return "#!";
        return root.val + "!" + Serialize(root.left) + Serialize(root.right);
    }
    TreeNode Deserialize(String str) {
        serialStrings = str.split("!");
        return Deserialize();
    }
    TreeNode Deserialize() {
        index++;
        if (serialStrings[index].equals("#")) return null;
        TreeNode node = new TreeNode(Integer.valueOf(serialStrings[index]));
        node.left = Deserialize();
        node.right = Deserialize();
        return node;
    }
}
