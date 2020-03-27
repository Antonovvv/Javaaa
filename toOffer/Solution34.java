package toOffer;
/*在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
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
    //归并排序改进,不返回数组,所以要传入拷贝,临时存放;
    public int InverseCount(int[] array, int[] copy, int low, int high) {
        if (low == high) return 0;
        int count = 0;
        int mid = (low + high) / 2;
        int leftCount = InverseCount(array, copy, low, mid);
        int rightCount = InverseCount(array, copy, mid + 1, high);
        int i = mid, j = high, p = high;
        while (i >= low && j > mid) {
            if (array[i] > array[j]) {
                count += j - mid;    //右序列中j左边的都小于array[i] 
                if (count > 1000000007) count %= 1000000007;    //数字过大时若不取余可能会溢出
                copy[p--] = array[i--];
            } else {
                copy[p--] = array[j--];
            }
        }
        for (;i >= low; i--) copy[p--] = array[i];    //剩余元素直接拷贝
        for (;j > mid; j--) copy[p--] = array[j];
        for (int m = low; m <= high; m++) array[m] = copy[m];
        return (leftCount + rightCount + count) % 1000000007;
    }
}
