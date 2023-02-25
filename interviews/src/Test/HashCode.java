package Test;

class HashCode {
	public static void main(String[] args) {
		String a = "Andrew";
		String b = "Andrew";

		Integer e = 3;

		/*
		 * if (a == b) { // checking the equality of objects using equals() methods
		 * System.out.
		 * println("a & b are equal variables, and their respective hashvalues are:" +
		 * " " + a.hashCode() + " & " + b.hashCode());
		 * 
		 * }
		 */

		if (a.equals(e)) { // checking the equality of objects using equals() methods
			System.out.println("a & b are equal variables, and their respective hashvalues are:" + " " + a.hashCode()
					+ " & " + e.hashCode());

		}

		String c = "Maria";
		String d = "Julie";

		if (!c.equals(d)) { // checking the equality of objects using equals() method
			System.out.println("\nc & d are Un-equal variables, and their respective hashvalues are:" + " "
					+ c.hashCode() + " & " + d.hashCode());

		}
	}
}