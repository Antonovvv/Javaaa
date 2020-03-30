package toOffer;
/*在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
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
