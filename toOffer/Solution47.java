package toOffer;
/*дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
 * 
 */
public class Solution47 {
	public int Add(int num1,int num2) {
        return num2 == 0 ? num1 : Add(num1 ^ num2, (num1 & num2) << 1);
    }
	public int Add1(int num1,int num2) {
        while (num2 != 0) {
            int t1 = num1 ^ num2;
            int t2 = (num1 & num2) << 1;
            num1 = t1; num2 = t2;
        }
        return num1;
    }
}
