package toOffer;
/*统计一个数字在排序数组中出现的次数。
 * 
 */
public class Solution36 {
	public int GetNumberOfK(int [] array , int k) {
        if (array.length == 0) return 0;
        int low = 0, high = array.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] < k) low = mid + 1;
            else if (array[mid] > k) high = mid - 1;
            else {
                int start = mid, end = mid;
                while (start > 0 && array[start - 1] == k) start -= 1;
                while (end < (array.length - 1) && array[end + 1] == k) end += 1;
                return end - start + 1;
            }
        }
        return 0;
    }
}
