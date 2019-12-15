import java.util.Arrays;

public class With_out_duplicates_jdk8_streams 
{
	public static void main(String[] args) 
	{
		int numbers[] = {1,2,3,4,5,6,7,9,10,11,12}; // single element search with out duplicates.
		
		int N=12;
		
		int idealSum= (N*(N+1))/2;
		
		int sum=Arrays.stream(numbers).sum(); // Lazy initialization of numbers using sum method
		
		int missingNumber = idealSum-sum;
		
		System.out.println(missingNumber);
		
		
	}

}
