package toOffer;
/*��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬
 * �ظ��Ľ�㲻��������������ͷָ�롣 ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
 */
public class Solution55 {
	public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null) return null;
        ListNode beforeHead = new ListNode(0), cur = pHead, prev = beforeHead;
        beforeHead.next = pHead;
        while (cur != null) {
            if (cur.next != null && cur.next.val == cur.val) {
                while (cur.next != null && cur.next.val == cur.val) cur = cur.next;
                prev.next = cur.next;
                cur = prev.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        return beforeHead.next;
    }
}
