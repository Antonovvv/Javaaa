package problems_2020_3;

/*我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
	比如n=3时，2*3的矩形块有3种覆盖方法：*/
public class Solution9 {
	public int RectCover(int target) {
        if (target == 1) return 1;
        else if (target == 2) return 2;
        int sum = 0; int lastOne = 2; int lastTwo = 1;
        for (int i = 3; i <= target; i++) {
            sum = lastOne + lastTwo;
            lastTwo = lastOne;
            lastOne = sum;
        }
        return sum;
    }
}
