package ds00.basic;

import java.util.stream.LongStream;

class Dril {
	int num;
	int fac = 1;

//First Method Using Loop
	public int fact(int n) {
		if (n == 0)
			return 1;
		else
			for (int i = 1; i <= n; i++) {
				fac = fac * i;
			}
		return fac;
	}

	// Using Recursion
	public int fact2(int n) {
		if (n == 0)
			return 1;
		else
			return n * fact2(n - 1);
	}

	public static long factorialStreams(long n) {
		return LongStream.rangeClosed(2, n).reduce(1, (long a, long b) -> a * b);
	}
}
interface Dril1{
	public int fact2(int n);
}

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dril1 od1=(int n)->{
			return n;	
			
		};
		Dril od = new Dril();
		int res = od.fact(4);
		System.out.println("Factorial is :" + res);

		/*
		 * int res2=od.fact(4); System.out.println("Factorial is :"+res2);
		 */
		long res3 = Dril.factorialStreams(4);
		System.out.println("Factorial is :" + res3);
	}

}
