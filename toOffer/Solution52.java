package toOffer;
/*��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
 * ���磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ�� ����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ�
 */
public class Solution52 {
	public boolean isNumeric(char[] str) {
        if (str.length == 0) return false;
        return String.valueOf(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
