package problems_2020_3;

/*���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
	����n=3ʱ��2*3�ľ��ο���3�ָ��Ƿ�����*/
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
