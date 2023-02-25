package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordOccrance {

	public static void main(String args[]) {

		// java 7

		String word = "vvnkateshd";

		for (int i = 0; i < word.length(); i++) {
			// System.out.println("java7" + word.charAt(i));
		}

		// java 8 Function Identity output returns same as input

		Map<Character, Long> wordC = word.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Lamda Expertions

		Map<Object, Long> count = word.chars().mapToObj(j -> (char) j)
				.collect(Collectors.groupingBy(j -> j, Collectors.counting()));

		// System.out.println("Count" + count);

		// wordC.forEach((k, v) -> System.out.print(k + " " + v + ""));

		String wordo = "Java is Awesome";

		String str = "venkatesh venkatesh venkatesh jose";

		List<String[]> maplist = Stream.of(str).map(m -> m.split("\\s+")).collect(Collectors.toList());

		Stream<String> s = Stream.of(str);

		s.forEach((i) -> System.out.println("LLL" + i));

		List<String> list = Stream.of(str).map(m -> m.split("\\s+")).flatMap(Arrays::stream)
				.collect(Collectors.toList());

		/* maps.forEach((j, k) -> System.out.println(j + " " + k)); */

		Map<Object, Long> maps = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// maps.forEach((j, k) -> System.out.println(j + " " + k));

		ArrayList<Integer> lists = new ArrayList<Integer>();
		lists.add(1);
		lists.add(2);
		lists.add(2);

		Map<Object, Long> mapsl = lists.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		mapsl.forEach((j, k) -> System.out.println(j + " " + k));

		Integer a = mapsl.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> (int) entry.getKey())
				.findFirst().get();

		System.out.println(a);

		////// Word Occurance Greater then

		List<String> oo = list.stream().collect(Collectors.groupingBy(j -> j, Collectors.counting())).entrySet()
				.stream().filter(i -> i.getValue() > 2).map(Entry::getKey).collect(Collectors.toList());

		System.out.println("mappss"+maps);
		
		System.out.println("llllllllll" + oo);

	}

}
