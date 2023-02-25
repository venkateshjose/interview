package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class OddOrEven {

	public static void main(String args[]) {

		Integer[] i = { 1, 2, 3, 4, 5, 6 };

		Arrays.stream(i).filter(k -> k % 2 == 0).forEach(System.out::println);

		// Function<Integer, Boolean> st = o -> o % 2 == 0;

		// Arrays.stream(i).map(st).forEach(System.out::println);

		Arrays.stream(i).filter(j -> j % 2 == 0).filter(k -> k % 2 != 0).forEach(l -> System.out.println(l));
		
		class Innner{
			
		}
		
		Inner()
		{
			
		}

	}

}
