package ds00.basic;

import java.util.stream.LongStream;

class Fib {
	public void fib(int n) {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i <= n; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

	public int fib2(int n1) {
		if (n1 == 0 || n1 == 1)
			return 1;
		else
			return fib2(n1 - 1) + fib2(n1 - 2);
	}
	
}
public class Fibonacci {
	public static void main(String[] args) {
		Fib ob = new Fib();
		ob.fib(4);
	}

}
