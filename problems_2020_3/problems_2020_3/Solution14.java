package problems_2020_3;

import java.util.Stack;
/*输入一个链表，反转链表后，输出新链表的表头。
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
			next = head.next;	//存下next
			head.next = pre;	//next指向前置结点
			pre = head;			//pre指向当前结点
			head = next;		//当前结点后移
		}
		return pre;				//pre为最后一个结点，即反转链表头部；此时next==head==null
	}
}
