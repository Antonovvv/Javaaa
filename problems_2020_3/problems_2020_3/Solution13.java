package problems_2020_3;

/*����һ����������������е�����k����㡣
 * 
 */
public class Solution13 {
	public ListNode FindKthToTail0(ListNode head,int k) {
        int len = 0;
        ListNode node = head;
        while (node != null) {
            len++;
            node = node.next;
        }
        if (k > len) return null;
        for (int i = 0; i < len - k; i++) {
            head = head.next;
        }
        return head;
    }
	
	public ListNode FindKthToTail1(ListNode head,int k) {	//!!!����ָ��!
        ListNode slow = head, fast = head;
        for (int i = 0; i < k; i++) {
        	if (fast == null) return null;
        	fast = fast.next;
        }
        while (fast != null) {
        	slow = slow.next;
        	fast = fast.next;
        }
        return slow;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
