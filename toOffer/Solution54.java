package toOffer;
/*给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * 
 */
public class Solution54 {
	public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead == null) return null;
        ListNode slow = pHead, fast = pHead;
        while (true) {
            if (slow.next == null || fast.next == null || fast.next.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        while (pHead != null) {
            if (fast == pHead) return pHead;
            fast = fast.next;
            if (slow == fast) pHead = pHead.next;
        }
        return null;
    }
	public ListNode EntryNodeOfLoop1(ListNode pHead)
    {
        if (pHead == null) return null;
        ListNode slow = pHead, fast = pHead;
        while (true) {
            if (fast.next == null || fast.next.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) break;
        }
        fast = pHead;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
