package toOffer;
/*将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
输入描述:
输入一个字符串,包括数字字母符号,可以为空
输出描述:
如果是合法的数值表达则返回该数字，否则返回0
*/
public class Solution48 {
	/*Integer范围-2147483648~2147483647,负的绝对值大*/
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
