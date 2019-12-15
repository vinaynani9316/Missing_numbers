import java.util.Arrays;
import java.util.List;
public class OnlyProduct {

	public static void main(String[] args)  //using java8 streams
	{
		List<Integer> l= Arrays.asList(22,42,52,79);
		System.out.println(l.stream().reduce(1, (a,b)->a*b));
	}
}
