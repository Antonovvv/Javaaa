package toOffer;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class Solution24 {
    public RandomListNode Clone(RandomListNode pHead)
    {
    	if (pHead == null) return null;
        RandomListNode node = pHead;
        while (node != null) {
            RandomListNode cloneNode = new RandomListNode(node.label);
            cloneNode.next = node.next;
            node.next = cloneNode;
            node = cloneNode.next;
        }
        node = pHead;
        while (node != null) {
        	if (node.random != null) {
        		node.next.random = node.random.next;
        	}
            node = node.next.next;
        }
        node = pHead;
        RandomListNode pCloneHead = pHead.next;    //必须还原原链表pHead,不能作改动
        while (node != null) {
            RandomListNode cloneNode = node.next;
            node.next = cloneNode.next;
            if (cloneNode.next != null) {
                cloneNode.next = cloneNode.next.next;
            }
            node = node.next;
        }
        return pCloneHead;
    }
}