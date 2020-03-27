package toOffer;
import java.util.*;
/*LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...
 * ��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���
 * ������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....LL��������,��������,������\С �����Կ����κ�����,
 * ����A����1,JΪ11,QΪ12,KΪ13�������5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),��So Lucky!����
 * LL����ȥ��������Ʊ���� ����,Ҫ����ʹ�������ģ������Ĺ���,
 * Ȼ���������LL��������Σ� ����������˳�Ӿ����true����������false��Ϊ�˷������,�������Ϊ��С����0��
 */
public class Solution44 {
	public boolean isContinuous(int [] numbers) {
        if (numbers.length != 5) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1, min = 14;
        for (int num : numbers) {
            if (num < 0 || num > 13) return false;
            if (num != 0) {
                if (map.containsKey(num)) return false;
                map.put(num, 1);
                if (num > max) max = num;
                if (num < min) min = num;
                if (max - min >= 5) return false;
            }
        }
        return true;
    }
}
