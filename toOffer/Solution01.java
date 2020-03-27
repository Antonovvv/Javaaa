package toOffer;

/*请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。*/
public class Solution01 {
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
		Solution01 my = new Solution01();
		StringBuffer strbuf = new StringBuffer("we  ");
		System.out.println(my.replaceSpace(strbuf));
	}

}
