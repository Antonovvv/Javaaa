package toOffer;
/*请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
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
