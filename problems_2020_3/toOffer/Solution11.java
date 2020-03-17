package toOffer;

import java.math.*;

/*����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
��֤base��exponent��ͬʱΪ0*/
public class Solution11 {
	public static double Power0(double base, int exponent) {
		double res = 1;
		if (exponent < 0) {
			for (int i = exponent; i < 0; i++) {
				res /= base;
			}
		} else {
			for (int i = 0; i < exponent; i++) {
				res *= base;
			}
		}
        return res;
    }
	
	public static double Power1(double base, int exponent) {
		double res = 1; int e = Math.abs(exponent);
		while (e != 0) {
			if (e % 2 != 0) res *= base;
			base *= base;
			e >>= 1;
		}
		return exponent > 0 ? res : 1 / res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Power0(2, -21));
	}

}
