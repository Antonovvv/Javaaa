package problems_2020_3;

/*输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
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
