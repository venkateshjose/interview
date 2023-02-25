import java.util.HashMap;
import java.util.Map;

public class Testimmutablestring {

	public static void main(String args[]) {
		StringBuffer s = new StringBuffer("Sachin");
		StringBuffer s1 = new StringBuffer("Sachin");

		// concat() method appends the string at the end
		System.out.println(s);// will print Sachin because strings are immutable objects

	}

}

final class Employee {
	final String pancardNumber;

	public Employee(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}
}

class ImmutableDemo {
	public static void main(String ar[]) {
		Employee e = new Employee("ABC123");
		String s1 = e.getPancardNumber();
		System.out.println("Pancard Number: " + s1);
	}
}
