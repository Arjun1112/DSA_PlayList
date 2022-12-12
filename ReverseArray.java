package ds00.basic;

interface Arr{
	public void rev(int []a);
}
public class ReverseArray implements Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArray ro=new ReverseArray();
		int arr[]= {2,4,6,8};
		ro.rev(arr);
		ro.rev2(arr);
	}

	@Override
	public void rev(int[] a) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
	}
	public void rev2(int a1[]) {
		int i=0;
		int n1=a1.length-1;
		while(n1>i) {
			int temp=a1[i];
			a1[i]=a1[n1];
			a1[n1]=temp;
			i++;
			n1--;
			
		}
		System.out.println("jsfakgjd");
		for(int i1=0;i1<a1.length;i1++) {
			System.out.println(a1[i1]);
		}
		
	}

}
