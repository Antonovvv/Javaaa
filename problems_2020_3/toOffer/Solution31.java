package toOffer;

/*����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 */
public class Solution31 {
	public String PrintMinNumber(int [] numbers) {
        String res = "";
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int a = Integer.valueOf(numbers[i] + "" + numbers[j]);
                int b = Integer.valueOf(numbers[j] + "" + numbers[i]);
                if (a > b) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            res += String.valueOf(numbers[i]);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
