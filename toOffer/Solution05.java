package toOffer;

/*��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��*/
public class Solution05 {
	public static int minNumberInRotateArray(int[] array) {	//���ֲ��ұ���
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
