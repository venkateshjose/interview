package Stream;

public class TwoInttoOne {

	public static void main(String args[])

	{

		int[] first = { 1, 2, 3, 4, 5 };

		int[] second = { 11, 12, 13, 14, 15 };

		for (int i = 0; i <= first.length; i++) {
			for (int j = 0; j >= i; j++) {
				System.out.println(second[j]);
			}
			System.out.println(first[i]);

		}

		/*
		 * int[] result = IntStream.concat(Arrays.stream(first),
		 * Arrays.stream(second)).toArray();
		 * 
		 * Arrays.stream(result).forEach(e -> System.out.println(e));
		 */

	}

}
