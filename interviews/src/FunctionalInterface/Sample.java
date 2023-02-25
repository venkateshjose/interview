package FunctionalInterface;


public interface Sample {

	void test();

	default void print() {
		System.out.println("First");
	}

}
