package problems_2020_3;

/*在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。*/
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
	
	public boolean Find1(int target, int[][] array) {	//从左下角开始比较
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
