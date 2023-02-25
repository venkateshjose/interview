package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {
	
	
	private static int fact(int n) {
		return n * fact(n * 1);
	}


	public static void main(String args[]) {
		
		
		System.out.print(fact(5));

		/*
		 * List<Employee> employee = Arrays.asList(new Employee("venkateh", 1000,
		 * "chennai", 5), new Employee("santha", 2000, "avadi", 8));
		 * 
		 * employee.stream().filter(emp -> emp.getSalary() >
		 * 100).forEach(System.out::println);
		 */

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Nataraja G", "Accounts", 8000));
		empList.add(new Employee("Nagesh Y", "Admin", 15000));
		empList.add(new Employee("Vasu V", "Security", 2500));
		empList.add(new Employee("Amar", "Entertinment", 12500));

		// find employees whose salaries are above 10000
		List<String> empploy = empList.stream().filter(emp -> emp.getSalary() > 10000).map(emp -> emp.getName())
				.collect(Collectors.toList());

		empploy.forEach(System.out::println);

	}
	
	
	

}
