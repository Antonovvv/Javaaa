package toOffer;
import java.util.ArrayList;
/*输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
输出描述:
对应每个测试案例，输出两个数，小的先输出。*/
public class Solution41 {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int low = 0, high = array.length - 1;
        while (low < high) {
            int a = array[low] + array[high];
            if (a == sum) {
                res.add(array[low]);res.add(array[high]);break;
            } else if (a < sum) {
                low++;
            } else high--;
        }
        return res;
    }
}
