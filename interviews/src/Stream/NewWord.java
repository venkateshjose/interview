package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewWord {

	public static void main(String args[]) {

		String str = "venkatesh venkatesh hh";

		List<String[]> maplist = Stream.of(str).map(m -> m.split("\\s+")).collect(Collectors.toList());

		System.out.println("LLLllllllllllllllllll" + maplist.get(0));

		Stream<String> s = Stream.of(str);

		s.forEach((i) -> System.out.println("LLL" + i));

		List<String> list = Stream.of(str).map(m -> m.split("\\s+")).flatMap(Arrays::stream)
				.collect(Collectors.toList());

		System.out.println("LLLllllllllllllllllll000000000" + list.size());
	}
}
