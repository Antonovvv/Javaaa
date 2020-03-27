package toOffer;

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
	int val;
	ListNode next = null;
	
	ListNode (int val) {
		this.val = val;
	}
}

/*输入一个链表，按链表从尾到头的顺序返回一个ArrayList。*/
public class Solution2 {
	public static ArrayList<Integer> printListFromTailToHead0(ListNode listNode) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (listNode != null) {
			array.add(0, listNode.val);
			listNode = listNode.next;
		}
		return array;
	}
	
	public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
		Stack<Integer> temp = new Stack<>();
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (listNode != null) {
			temp.push(listNode.val);
			listNode = listNode.next;
		}
		while (!temp.empty()) {
			array.add(temp.pop());
		}
		return array;
	}
	
	public static void main(String[] args) {
		ListNode listHead = new ListNode(0);
		ListNode list = listHead;
		for (int i = 1; i < 11; i++) {
			list.next = new ListNode(i);
			list = list.next;
		}
		list = listHead;
		while (list != null) {
			System.out.print(list.val);System.out.print(" ");
			list = list.next;
		}
		System.out.println("");
		ArrayList<Integer> array = printListFromTailToHead1(listHead);
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i));System.out.print(" ");
		}
	}
}
