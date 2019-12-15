
public class With_Duplicates {

	public static void main(String[] args) 
	{
		int numbers[] = {1,1,2,3,4,6,6,9,9,9};
		
		int duplicate[] = new int[numbers.length];
		
		for(int element : numbers)
			duplicate[element] = 1; // iterating if elements present & duplicates
		
		for(int i=1; i<duplicate.length-1; i++)
		{
			if(duplicate[i]== 0) // iterating if elements not present
			{
				System.out.println(i);
			}
		}
		

	}

}