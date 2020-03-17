package toOffer;

import java.util.Stack;
/*���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ�
 * ��������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 */
public class Solution20 {
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		Stack<Integer> stack = new Stack<Integer>();
		int popIndex = 0;
		for (int i = 0; i < pushA.length; i++) {
			stack.push(pushA[i]);
			while (popA[popIndex] == stack.peek()) {
				stack.pop();
				popIndex++;
				if (stack.empty()) break;
			}
		}
		return popIndex == pushA.length ? true : false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(IsPopOrder(new int[] {1,2,3,4,5}, new int[] {4,5,3,2,1}));
	}

}
