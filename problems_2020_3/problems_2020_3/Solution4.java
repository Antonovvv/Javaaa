package problems_2020_3;

import java.util.Stack;

/*������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�*/
public class Solution4 {
	Stack<Integer> stack1 = new Stack<Integer>();	//��ջ
	Stack<Integer> stack2 = new Stack<Integer>();	//ȡջ
	
	public void push(int node) {
		/*while (!stack2.empty()) {
			stack1.push(stack2.pop());
		}*/
		stack1.push(node);
	}
	
	public int pop() {
		if (stack2.empty()) {
			while (!stack1.empty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution4 queue = new Solution4();
		for (int i = 0; i < 15; i++) {
			queue.push(i);
		}
		while (!queue.stack1.empty() || !queue.stack2.empty()) {
			System.out.print(queue.pop() + " ");
		}
	}

}
