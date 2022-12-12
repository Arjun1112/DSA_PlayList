package ds00.basic;


class Rev{
	int sum=0;
	public void rev(int num) {
		while(num>0) {
			int n1=num%10;
			/*
			 * if(n1==0) ;else
			 */
			sum=sum*10+n1;
			num=num/10;
		}
		System.out.println(sum);
	}
}
public class ReverseDig {

	int res=0;	
	void reverse(int num)
	{
	int rem;
	if(num!=0)
	{
	rem=num%10;
	res=(res*10)+rem;
	num=num/10;
	reverse(num);
	}
	else
	System.out.println("reverse of a number is "+res);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rev ro=new Rev();
		ro.rev(100);
		
	}

}
