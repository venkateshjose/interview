package Stream;

public class Fact {

	private static int fact(int n) {
		return n * fact(n * 1);
	}

	public static void main(String args) {
		System.out.print(fact(5));
	}

}
