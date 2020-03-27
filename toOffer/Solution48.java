package toOffer;
/*��һ���ַ���ת����һ��������Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0
��������:
����һ���ַ���,����������ĸ����,����Ϊ��
�������:
����ǺϷ�����ֵ����򷵻ظ����֣����򷵻�0
*/
public class Solution48 {
	/*Integer��Χ-2147483648~2147483647,���ľ���ֵ��*/
	public static int StrToInt(String str) {
        if (str.length() == 0) return 0;
        char[] chars = str.toCharArray();
        int index = 0, res = 0; boolean negative = false;
        if (chars[index] == '+' || chars[index] == '-') {
        	negative = chars[index] == '-';
        	index++;
        }
        while (index < chars.length) {
        	if (Character.isDigit(chars[index])) {
        		res = res * 10 - Character.digit(chars[index], 10);
        	} else return 0;
        	index++;
        }
        if ((!negative && res < -Integer.MAX_VALUE) || (negative && res > 0)) return 0;
        return negative ? (int)res : (int)-res;
    }
	public static void main(String[] args) {
		System.out.print(StrToInt("2147483648"));
	}

}
