package toOffer;
/*�������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�
 * ����һ������,�����������е�����Ե�����P������P��1000000007ȡģ�Ľ������� �����P%1000000007
 */
public class Solution34 {
	public int InversePairs(int [] array) {
        if (array.length <= 1) return 0;
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return InverseCount(array, copy, 0, array.length - 1);
    }
    //�鲢����Ľ�,����������,����Ҫ���뿽��,��ʱ���;
    public int InverseCount(int[] array, int[] copy, int low, int high) {
        if (low == high) return 0;
        int count = 0;
        int mid = (low + high) / 2;
        int leftCount = InverseCount(array, copy, low, mid);
        int rightCount = InverseCount(array, copy, mid + 1, high);
        int i = mid, j = high, p = high;
        while (i >= low && j > mid) {
            if (array[i] > array[j]) {
                count += j - mid;    //��������j��ߵĶ�С��array[i] 
                if (count > 1000000007) count %= 1000000007;    //���ֹ���ʱ����ȡ����ܻ����
                copy[p--] = array[i--];
            } else {
                copy[p--] = array[j--];
            }
        }
        for (;i >= low; i--) copy[p--] = array[i];    //ʣ��Ԫ��ֱ�ӿ���
        for (;j > mid; j--) copy[p--] = array[j];
        for (int m = low; m <= high; m++) array[m] = copy[m];
        return (leftCount + rightCount + count) % 1000000007;
    }
}
