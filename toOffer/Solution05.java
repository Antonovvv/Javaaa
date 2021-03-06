package toOffer;

/*把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。*/
public class Solution05 {
	public static int minNumberInRotateArray(int[] array) {	//二分查找变种
		if (array.length == 0) return 0;
		int low = 0; int high = array.length - 1;
		while (low < high) {
			int mid = (high + low) / 2;
			if (array[mid] > array[high]) {	//{1,2,3,0,1}
				low = mid + 1;
			} else if (array[mid] == array[high]) {	//{3,3,3,1,3} or {1,2,3,3,3}
				high = high - 1;
			} else {	//{8,2,3,4,5}
				high = mid;
			}
		}
		return array[low];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(minNumberInRotateArray(new int[] {3,4,5,1,2}));
	}

}
