package Interface;

class TestClass implements TestInterface {
	// Implementation of square abstract method
	public void square(int a) {
		System.out.println(a * a);
	}

	/*
	 * public void show1() { System.out.println("Default override Method Executed");
	 * }
	 */
	public static void main(String args[]) {
		TestClass d = new TestClass();
		d.square(4);

		// Static method executed
		d.show1();
		d.show1();
	}
}