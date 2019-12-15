public class With_out_duplicates_jdk7 
{
  
 public static void main(String[]a)
 {
	 int numbers[] = {1,2,3,4,5,7,8,9,10,11,12};
	 
	 int N=12;
	 
	 int idealSum= (N*(N+1))/2;  // calculating N binary sum/2
	 
	 int sum=calculateSum(numbers);  // calculating sum of numbers
	 
	 int missingNumber= idealSum-sum;
	 
	 System.out.println(missingNumber);
 }
 
   private static int calculateSum(int numbers[])
   {
	   int sum=0;
	   for(int result:numbers)
	   {
		   sum += result; 
	   }
	   return sum;
   }
}
