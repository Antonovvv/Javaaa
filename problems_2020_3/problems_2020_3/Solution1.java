package problems_2020_3;

/*��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��*/
public class Solution1 {
	public String replaceSpace(StringBuffer str) {
		String string = str.toString();	//StringBuffer to String
		int spaceIndex = 0;
		while (str.indexOf(" ", spaceIndex) != -1) {
			spaceIndex = str.indexOf(" ", spaceIndex);
			str.replace(spaceIndex, spaceIndex + 1, "%20");
			string = str.toString();
		}
		return string;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 my = new Solution1();
		StringBuffer strbuf = new StringBuffer("we  ");
		System.out.println(my.replaceSpace(strbuf));
	}

}
