package problems_2020_3;

/*��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������*/
public class Solution0 {
	public boolean Find0(int target, int[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].length == 0) return false;
			else if (array[i][0] > target) return false;
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == target) return true;
				else if (array[i][j] > target) break;
			}
		}
		return false;
	}
	
	public boolean Find1(int target, int[][] array) {	//�����½ǿ�ʼ�Ƚ�
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i].length == 0) return false;
			for (int j = 0; j < array[i].length; j++) {
				if (target > array[i][j]) continue;
				else if (target < array[i][j]) break;
				else return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution0 my = new Solution0();
		int[][] a = {{}, {}, {}};
		boolean res = my.Find1(4, a);
		System.out.println(res);
	}

}
