package FunctionalInterface;
@FunctionalInterface
public interface Sample2 {

	void test();

	default void print() {
		System.out.println("First");
	}

}
