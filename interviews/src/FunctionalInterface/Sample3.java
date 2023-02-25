package FunctionalInterface;

public class Sample3 implements Sample, Sample2 {

	@Override
	public void test() {
		System.out.println("Sample3");

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Sample2.super.print();
	}

	public static void main(String args[]) {

	}

}
