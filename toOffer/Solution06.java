package toOffer;

/*��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
n<=39*/
public class Solution06 {
	public static int Fibonacci(int n) {
		if (n == 0) return 0;
        else if (n == 1) return 1;
        int fib = 0; int last = 1; int beforeLast = 0;
        for (int i = 2; i <= n; i++) {
        	fib = last + beforeLast;
        	beforeLast = last;
        	last = fib;
        }
        return fib;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Fibonacci(40));
	}

}
