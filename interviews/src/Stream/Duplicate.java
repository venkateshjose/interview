package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String args[]) {

/// retain all
		List<String> list = new ArrayList<String>();
		list.add("venkatesh");
		list.add("venkatesh1");

		List<String> list2 = new ArrayList<String>();
		list2.add("venkatesh");
		list2.add("venkatesh");

		// list.retainAll(list2);

		System.out.println(list);

		/// Filter

		List<String> a = list.stream().filter(l -> !(list2.contains(l))).collect(Collectors.toList());

		a.forEach(i -> System.out.println(i));

	}

}
