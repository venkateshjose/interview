package Stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfNumber {

	public static void main(String arg[]) {

		int i = 10111;

		long a = Stream.of(String.valueOf(i).split("")).collect(Collectors.summarizingInt(Integer::parseInt)).getSum();

		System.out.println("llllll" + a);
		if (a == 4) {
			System.out.println("llllll");
		}

	}

}
