package toOffer;
import java.util.HashMap;
/*��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��,
 *  ���û���򷵻� -1����Ҫ���ִ�Сд��.
 * 
 */
public class Solution33 {
	public int FirstNotRepeatingChar(String str) {
        if (str.length() == 0) return -1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
