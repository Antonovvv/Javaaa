package problems_2020_3;

import java.util.ArrayList;
/*����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣����磬�����������4 X 4����
 *  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 �����δ�ӡ������
 *  1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *   1, 2, 3, 4
 *   5, 6, 7, 8
 *   9,10,11,12
 *  13,14,15,16
 */
public class Solution18 {
	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		int rows = matrix.length; int cols = matrix[0].length;
		int up = 0, down = 0, left = 0, right = 0;
		while (up + down < rows && left + right < cols) {
			for (int i = left; i < cols - right; i++) {res.add(matrix[up][i]);}
			up++;
			for (int i = up; i < rows - down; i++) {res.add(matrix[i][cols - right - 1]);}
			right++;
			if (up + down < rows && left + right < cols) {
				for (int i = cols - right - 1; i >= left; i--) {res.add(matrix[rows - down - 1][i]);}
				down++;
				for (int i = rows - down - 1; i >= up; i--) {res.add(matrix[i][left]);}
				left++;
			}
		}
		return res;
	}
		
	public static void main(String[] args) {
		//{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}
		ArrayList<Integer> array = printMatrix(new int[][] {{1,2,3}});
		for (int i = 0; i < array.size(); i++)	System.out.print(array.get(i) + " ");
	}

}
