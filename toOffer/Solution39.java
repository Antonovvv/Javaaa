package toOffer;
/*一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * 
 */
public class Solution39 {
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int differentBits = 0, difference = 0;
        for (int i : array) {
            differentBits ^= i;
        }
        while (differentBits % 2 != 1) {
            differentBits >>= 1;
            difference++;
        }
        int[] newArray1 = new int[array.length], newArray2 = new int[array.length];
        int p1 = 0, p2 = 0;
        for (int i : array) {
            if ((i >> difference) % 2 == 1) newArray1[p1++] = i;
            else newArray2[p2++] = i;
        }
        num1[0] = num2[0] = 0;
        for (int i : newArray1) {
            num1[0] ^= i;
        }
        for (int i : newArray2) {
            num2[0] ^= i;
        }
    }
}
