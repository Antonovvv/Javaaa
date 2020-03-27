package toOffer;
/*�����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ�����������
 * ����һ���������ַ�����S���������ѭ������Kλ������������
 * ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
 */
public class Solution42 {
	public String LeftRotateString(String str,int n) {
        if (str.length() == 0) return "";
        char[] chars = str.toCharArray();
        int t = n % chars.length;
        reverse(chars, 0, t);
        reverse(chars, t, chars.length);
        reverse(chars, 0, chars.length);
        return String.valueOf(chars);
    }
    public void reverse(char[] chars, int start, int end) {
        char tmp;
        end--;
        while (start < end) {
            tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++; end--;
        }
    }
}
