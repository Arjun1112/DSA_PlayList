package ds00.basic;

import java.util.Arrays;

class Max_M{
	public void min_max(int a[]) {
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];		
		}
		System.out.println(min+"  "+max);
	}
	public void min_max2(int a[] ){
		Arrays.sort(a);
		System.out.println("Minimum :"+a[0]);
		System.out.println("Maximum :"+a[a.length-1]);
	}
	
}
public class MaxMinData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max_M mo=new Max_M();
		int arr[]= {12,3,42,10,3,9};
		mo.min_max(arr);
		mo.min_max2(arr);

	}

}
