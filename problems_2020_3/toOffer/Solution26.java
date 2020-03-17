package toOffer;

import java.util.ArrayList;
import java.util.Arrays;
/*输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
输入描述:
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。*/
public class Solution26 {
	public ArrayList<String> Permutation(String str) {    //字典序全排列
        ArrayList<String> res = new ArrayList<String>();
        if (str == null || str.length() == 0) return res;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);    //先按字典序排序
        res.add(String.valueOf(chars));    //第一个排列
        while (true) {
            int len = chars.length;
            int left = len - 1;    //从尾部开始的第一个满足chars[i-1] < chars[i]的i
            int right = 0;    //从left开始最后一个chars[i] > chars[left - 1]的i+1
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
