package problems_2020_3;

/*����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��*/
public class Solution10 {
	public static int NumberOf1(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n & (n - 1);	//��һ��������ȥ1�����������������㣬�ͻ�Ѹ��������ұ�һ��1���0��
		}
		return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOf1(-5));
	}

}