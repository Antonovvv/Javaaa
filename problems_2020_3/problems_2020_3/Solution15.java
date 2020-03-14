package problems_2020_3;

/*输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则
 */
public class Solution15 {
	public class Solution {
	    public ListNode Merge(ListNode list1,ListNode list2) {
	        if (list1 == null) return list2;
	        if (list2 == null) return list1;
	        ListNode head;
	        if (list1.val < list2.val) {
	            head = list1;	//new ListNode(list1.val);
	            list1 = list1.next;
	        } else {
	            head = list2;	//new ListNode(list2.val);
	            list2 = list2.next;
	        }
	        ListNode list = head;
	        while (list1 != null && list2 != null) {
	            if (list1.val < list2.val) {
	                list.next = list1;	//new ListNode(list1.val);
	                list1 = list1.next;
	            } else {
	                list.next = list2;	//new ListNode(list2.val);
	                list2 = list2.next;
	            }
	            list = list.next;
	        }
	        list.next = list1 == null ? list2 : list1;
	        return head;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
