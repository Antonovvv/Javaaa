package toOffer;

import java.util.Stack;
/*����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
ע�⣺��֤�����в��ᵱջΪ�յ�ʱ�򣬶�ջ����pop()����min()����top()������*/

public class Solution19 {
	Stack<Integer> elem = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    public void push(int node) {
        elem.push(node);
        if (min.empty() || node < min.peek()) {
            min.push(node);
        }
    }
    
    public void pop() {
        if (elem.pop() == min.peek()) {
            min.pop();
        }
    }
    
    public int top() {
        if (elem.empty()) return 0;
        return elem.peek();
    }
    
    public int min() {
        if (min.empty()) return 0;
        return min.peek();
    }
}
