package Interface;

interface TestInterface {
	// abstract method
	public void square(int a);

	// static method
	static void show() {
		System.out.println("Static Method Executed");
	}

	// static method
	default void show1() {
		System.out.println("Default Method Executed");
	}
}
