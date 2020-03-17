package toOffer;

import java.util.ArrayList;
import java.util.Arrays;
/*����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
��������:
����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��*/
public class Solution26 {
	public ArrayList<String> Permutation(String str) {    //�ֵ���ȫ����
        ArrayList<String> res = new ArrayList<String>();
        if (str == null || str.length() == 0) return res;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);    //�Ȱ��ֵ�������
        res.add(String.valueOf(chars));    //��һ������
        while (true) {
            int len = chars.length;
            int left = len - 1;    //��β����ʼ�ĵ�һ������chars[i-1] < chars[i]��i
            int right = 0;    //��left��ʼ���һ��chars[i] > chars[left - 1]��i+1
            while (left > 0 && chars[left - 1] >= chars[left]) left--;
            if (left == 0) break;
            right = left;
            while (right < len && chars[right] > chars[left - 1]) right++;
            swap(chars, left - 1, right - 1);
            reverse(chars, left);
            res.add(String.valueOf(chars));
        }
        return res;
    }
    public void reverse(char[] chars, int index) {
        if (chars == null || chars.length <= index) return;
        for (int i = index; i < (chars.length + index) / 2; i++) {
        	int m = i, n = chars.length - 1 - i + index;
        	if (m < n) swap(chars, m, n);
        }
    }
    public void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution26 solution = new Solution26();
		ArrayList<String> array = solution.Permutation("acfff");
		for (String str: array) {
			System.out.print(str + " ");
		}
	}

}
