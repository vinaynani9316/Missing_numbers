public class Product 
{
	 static int lasttwodigit(int[] a, int n, int l)  //product of array & finding last digit of product
		{
			int num= (int) (Math.pow(10, l));
			int mul=a[0]% num;
			for(int i=0; i<n-1; i++)
			{
				a[i]= a[i]% num;
				mul=(a[i]*mul)% num;
			}
			
			return mul;
		}
   public static void main(String[] args) 
	{
		
		int a[] = {22,42,52};
		int l=1;
		int n=a.length;
		System.out.println(lasttwodigit(a, n, l));
	}

}
