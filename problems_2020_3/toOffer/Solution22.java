package toOffer;

import java.util.Arrays;
/*����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ��
 * 
 */
public class Solution22 {
	 public boolean VerifySquenceOfBST(int [] sequence) {
	        if (sequence.length == 0) return false;
	        return this.VerifyBST(sequence);
	    }
    public boolean VerifyBST(int[] sequence) {
        if (sequence.length <= 1) return true;
        int len = sequence.length;
        int rightSubIndex = len - 1;    //������λ��
        for (int i = 0; i < len - 1; i++) {
            if (sequence[i] > sequence[len - 1]) {
                rightSubIndex = i;
                break;
            }
        }
        for (int i = rightSubIndex + 1; i < len - 1; i++) {
            if (sequence[i] < sequence[len - 1]) return false;
        }
        return VerifyBST(Arrays.copyOfRange(sequence, 0, rightSubIndex)) &&
                VerifyBST(Arrays.copyOfRange(sequence, rightSubIndex, len - 1));
    }
    
    public static void main(String[] args) {
    	Solution22 solution = new Solution22();
    	System.out.print(solution.VerifySquenceOfBST(new int[] {4,8,6,12,16,14,10}));
    }
}
