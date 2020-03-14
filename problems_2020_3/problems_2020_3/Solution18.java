package problems_2020_3;

import java.util.ArrayList;
/*输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
 *  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字
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
