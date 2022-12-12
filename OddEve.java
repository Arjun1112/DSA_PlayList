package array.simple;

class Dril001{
	static int eve1[]= {};
	static int odd[]= {};
	public static void eve(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				int k=0;
				eve1[k++]=a[i];			
			}
			int j=0;
			odd[j++]=a[i];
		}
		System.out.println(eve1[1]);
	}
	public static void dis() {
		for(int i=0;i<15;i++) {
			System.out.println(eve1[i]);
		}
	}
}

public class OddEve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int [5];
		int arr1[]= {2,4,6,12,33};
		Dril001.eve(arr1);
	//	Dril001.dis();

	}

}
