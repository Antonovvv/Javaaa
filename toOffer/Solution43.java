package toOffer;
/*ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�ͬ��Cat��Fishд�������ĸ���Ȥ��
 * ��һ������Fish������������ȴ������������˼�����磬��student. a am I������������ʶ����
 * ��һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 */
public class Solution43 {
	public String ReverseSentence(String str) {
        if (str.length() == 0) return str;
        char[] chars = str.toCharArray();
        int prev = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                ReverseWord(chars, prev, i);
                prev = i + 1;
            }
        }
        ReverseWord(chars, prev, chars.length);
        ReverseWord(chars, 0, chars.length);
        return String.valueOf(chars);
    }
    public void ReverseWord(char[] chars, int start, int end) {
        char tmp;
        end--;
        while(start < end) {
            tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++; end--;
        }
    }
}
