package toOffer;
import java.util.LinkedList;
/*ÿ����һ��ͯ��,ţ�Ͷ���׼��һЩС����ȥ�����¶�Ժ��С����,����������ˡ�HF��Ϊţ�͵�����Ԫ��,��ȻҲ׼����һЩС��Ϸ��
 * ����,�и���Ϸ��������:����,��С������Χ��һ����Ȧ��Ȼ��,�����ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������
 * ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,���Ҳ��ٻص�Ȧ��,��������һ��С���ѿ�ʼ,
 * ����0...m-1����....������ȥ....ֱ��ʣ�����һ��С����,���Բ��ñ���,�����õ�ţ������ġ�����̽���ϡ���ذ�(��������Ŷ!!^_^)��
 * ������������,�ĸ�С���ѻ�õ������Ʒ�أ�(ע��С���ѵı���Ǵ�0��n-1)	���û��С���ѣ��뷵��-1
 */
public class Solution45 {
	public static int LastRemaining_Solution(int n, int m) {
        if (n < 1 || m < 1) return -1;
        if (n == 1) return 0;
        int index = 0;
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) list.add(i);
        while (list.size() > 1) {
            /*for (int i = 0; i < m; i++) {
            	index++;
                if (index >= list.size()) index = 0;
                System.out.print(list.get(index) + " ");
            }*/
        	index = (index + m - 1) % list.size();	//��m-1����
            //System.out.println();
            list.remove(index);
        }
        System.out.println();
        return list.getFirst();
    }
	public static void main(String[] args) {
		System.out.print(LastRemaining_Solution(5,2));
	}

}
