package toOffer;

import java.util.ArrayList;
/*����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 * 
 */
public class Solution28 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> leastNums = new ArrayList<Integer>(k);
        if (input.length == 0 || k == 0) return leastNums;
        if (k > input.length) return leastNums;
        int maxLeastNum = input[0];
        if (k == input.length){
            for (int i = 0; i< input.length; i++) leastNums.add(input[i]);
            return leastNums;
        }
        for (int i = 0; i < input.length; i++) {
            if (leastNums.size() < k) {
                leastNums.add(input[i]);
                if (input[i] > maxLeastNum) maxLeastNum = input[i];
            } else {
                if (input[i] < maxLeastNum) {
                    int max = leastNums.get(0);
                    for (int j = 0; j < k; j++) {
                        if (leastNums.get(j) == maxLeastNum) leastNums.set(j, input[i]);
                        if (leastNums.get(j) > max) max = leastNums.get(j);
                    }
                    maxLeastNum = max;
                }
            }
        }
        return leastNums;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
