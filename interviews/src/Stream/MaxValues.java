package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MaxValues {
	public static void main(String args[]) {

		Integer[] i = { 1, 2, 3, 4, 5, 6 };

		List<Integer> j = Arrays.asList(i);

		j.stream().max(Comparator.comparing(k -> k)).ifPresent(k -> System.out.println(k));

		// Integer max=j.stream().max((k, l) -> k.compareTo(l)).get();

		// System.out.println(max);

	}

}
