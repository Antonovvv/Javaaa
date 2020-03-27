package toOffer;
/*牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，
 * 有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。后来才意识到，
 * 这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
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
