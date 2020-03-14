package problems_2020_3;

/*输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。*/
public class Solution10 {
	public static int NumberOf1(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n & (n - 1);	//把一个整数减去1在与它本身做与运算，就会把该整数最右边一个1变成0。
		}
		return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOf1(-5));
	}

}
