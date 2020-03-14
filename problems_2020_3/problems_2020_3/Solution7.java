package problems_2020_3;

/*һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������*/
public class Solution7 {
	public int JumpFloor(int target) {
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
