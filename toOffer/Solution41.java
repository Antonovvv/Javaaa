package toOffer;
import java.util.ArrayList;
/*����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
�������:
��Ӧÿ�����԰����������������С���������*/
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
