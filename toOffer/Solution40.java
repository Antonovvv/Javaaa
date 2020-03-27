package toOffer;
import java.util.*;
/*С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
 * ���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
 * û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22�����ڰ����⽻����,
 * ���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!�������:
������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��*/
public class Solution40 {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		int low = 1, high = 2;
		while(low < high) {
			int aSum = (low + high) * (high - low + 1) / 2;
			if (aSum == sum) {
				ArrayList<Integer> array = new ArrayList<>();
				for (int i = low; i <= high; i++) array.add(i);
				res.add(array);
				low++;high++;low++;
			} else if (aSum < sum) {
				high++;
			} else low++;
		}
		return res;
    }
}
