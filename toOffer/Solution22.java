package toOffer;

import java.util.Arrays;
/*输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
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
        int rightSubIndex = len - 1;    //右子树位置
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
