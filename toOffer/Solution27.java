package toOffer;

import java.util.HashMap;
/*数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Solution27 {
	public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer, Integer> numCount = new HashMap<Integer, Integer>();
        int countMax = 0, mostNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (numCount.containsKey(array[i])) {
                int count = numCount.get(array[i]);
                numCount.put(array[i], ++count);
                if (count > countMax) {
                    countMax = count;
                    mostNum = array[i];
                }
            } else {
                numCount.put(array[i], 1);
                if (countMax < 1) {
                    countMax = 1;
                    mostNum = array[i];
                }
            }
        }
        return countMax > (array.length / 2) ? mostNum : 0;
    }
	public int MoreThanHalfNum_Solution2(int [] array) {
		if (array.length == 0) return 0;
		int survivedNum = array[0], count = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i] == survivedNum) count++;
			else {
				count--;
				if (count == 0) {
					survivedNum = array[i];
					count = 1;
				}
			}
		}
		count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == survivedNum) count++;
		}
		return count > (array.length / 2) ? survivedNum : 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution27 solution = new Solution27();
		System.out.print(solution.MoreThanHalfNum_Solution2(new int[] {1,2,3,2,2}));
	}

}
