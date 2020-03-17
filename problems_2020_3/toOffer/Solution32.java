package toOffer;

/*��ֻ����������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ������������7�� 
 * ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 */
public class Solution32 {
	public int GetUglyNumber_Solution(int index) {
        if (index < 7) return index;
        int[] res = new int[index];
        int p2 = 0, p3 = 0, p5 = 0;
        res[0] = 1;
        for (int i = 1; i < index; i++) {
            res[i] = Math.min(res[p2]*2, Math.min(res[p3]*3, res[p5]*5));
            if (res[i] == res[p2]*2) p2++;
            if (res[i] == res[p3]*3) p3++;
            if (res[i] == res[p5]*5) p5++;
        }
        return res[index - 1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
