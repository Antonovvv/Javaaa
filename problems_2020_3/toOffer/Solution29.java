package toOffer;

/*HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ����������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,
 * ������ȫΪ������ʱ��,����ܺý��������,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
 * ����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
 * ��һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
 */
public class Solution29 {
	public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) return 0;
        int maxOfPart = array[0];    //�Ե�ǰԪ�ؽ�β���������к͵����ֵ
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            maxOfPart = maxOfPart + array[i] > array[i] ? maxOfPart + array[i] : array[i];
            res = maxOfPart > res ? maxOfPart : res;
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
