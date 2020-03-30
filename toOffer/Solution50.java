package toOffer;
/*给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 */
public class Solution50 {
	public static int[] multiply(int[] A) {
        int n = A.length;
        if (n == 0) return null;
        int[] B = new int[n], C = new int[n];
        B[0] = 1; C[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            B[i] = B[i - 1] * A[i - 1];
            C[n - i - 1] = C[n - i] * A[n - i];
        }
        for (int i = 0; i < n; i++) B[i] *= C[i];
        return B;
    }
	public static int[] multiply1(int[] A) {
        int n = A.length;
        if (n == 0) return null;
        int[] B = new int[n];
        B[0] = 1;
        for (int i = 1; i < n; i++) {
            B[i] = B[i - 1] * A[i - 1];
        }
        int tmp = 1;
        for (int i = 0; i < n; i++) {
        	B[n - i - 1] *= tmp;
        	tmp *= A[n - i - 1];
        }
        return B;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num : multiply1(new int[]{2,3})) {
			System.out.print(num + " ");
		}
	}

}
