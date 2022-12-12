package ds00.basic;

public class CountDig {

	public static void main(String[] args) {
		int dig=3214;
		int count=0;
		while(dig>0) {
			++count;
			dig=dig/10;
		}
		System.out.println(count);
	}

}
