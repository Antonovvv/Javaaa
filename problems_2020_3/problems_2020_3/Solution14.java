package problems_2020_3;

import java.util.Stack;
/*����һ��������ת��������������ı�ͷ��
 * 
 */
public class Solution14 {
	public ListNode ReverseList0(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        if (stack.isEmpty()) return null;
        ListNode reversedHead = new ListNode(stack.pop());
        ListNode node = reversedHead;
        while (!stack.isEmpty()) {
            node.next = new ListNode(stack.pop());
            node = node.next;
        }
        return reversedHead;
    }
	
	public ListNode ReverseList1(ListNode head) {	//!!!
		ListNode next = null, pre = null;
		while (head != null) {
			next = head.next;	//����next
			head.next = pre;	//nextָ��ǰ�ý��
			pre = head;			//preָ��ǰ���
			head = next;		//��ǰ������
		}
		return pre;				//preΪ���һ����㣬����ת����ͷ������ʱnext==head==null
	}
}
