package ds00.basic;

class Str {
	String str = "Jai Shree Ram";

	public void rev() {
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}

	public void rev2() {
		char[] s1 = str.toCharArray();
		int n1 = s1.length - 1;
		System.out.println(n1);
		for (int i = n1; i >= 0; i--) {
			System.out.print(s1[i]);
		}
	}
}

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Str so = new Str();
		so.rev();
		so.rev2();

	}

}
