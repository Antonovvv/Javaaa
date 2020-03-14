package problems_2020_3;

/*����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
 * ���е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
 */
public class Solution12 {
	public static void reOrderArray(int[] array) {
		int[] evenArray = new int[array.length];
		int oddCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				array[oddCount] = array[i];
				oddCount++;
			} else {
				evenArray[i - oddCount] = array[i];
			}
		}
		for (int i = 0; i < array.length - oddCount; i++) {
			array[i + oddCount] = evenArray[i];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1,2,5,6,4,3,7,8};
		reOrderArray(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
