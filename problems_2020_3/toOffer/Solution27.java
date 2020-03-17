package toOffer;

import java.util.HashMap;
/*��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡���������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
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
