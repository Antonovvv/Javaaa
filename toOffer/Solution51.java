package toOffer;
/*��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ��� 
 * �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ�����磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
 */
public class Solution51 {
	public static boolean match(char[] str, char[] pattern)
    {
        return match(str, 0, pattern, 0);
    }
    public static boolean match(char[] str, int i, char[] pattern, int j) {
        if (j == pattern.length) return i == str.length;
        if (i < str.length && (str[i] == pattern[j] || pattern[j] == '.')) {
            if (j + 1 < pattern.length && pattern[j + 1] == '*') {
                return match(str, i, pattern, j + 2) || match(str, i + 1, pattern, j);
            } else return match(str, i + 1, pattern, j + 1);
        } else {
            if (j + 1 < pattern.length && pattern[j + 1] == '*') {
                return match(str, i, pattern, j + 2);
            }
        }
        return false;
    }
	public static void main(String[] args) {
		System.out.print(match("aacc".toCharArray(), "a*a*b*c*".toCharArray()));
	}

}
