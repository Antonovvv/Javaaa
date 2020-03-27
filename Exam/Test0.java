package Exam;

public class Test0 {
	public static String reverse (String str) {
        // write code here
        if (str.length() == 0) return str;
        char[] chars = str.toCharArray();
        int low = 0, high = chars.length - 1;
        char tmp;
        while (low < high) {
            tmp = chars[low];
            chars[low] = chars[high];
            chars[high] = tmp;
            low++; high--;
        }
        return String.valueOf(chars);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(reverse(" ab "));
	}

}
