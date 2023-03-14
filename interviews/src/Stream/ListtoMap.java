package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListtoMap {

	public static void main(String args[]) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Nataraja G", "Accounts", 9));
		empList.add(new Employee("Nagesh Y", "Admin", 15000));
		empList.add(new Employee("Vasu V", "Security", 2500));
		empList.add(new Employee("Amar", "Entertinment", 12500));

		List<Employee> empList2 = new ArrayList<>();
		empList2.add(new Employee("Nataraja G", "Accounts", 9));
		empList2.add(new Employee("Nagesh Y", "Admin", 10));
		empList2.add(new Employee("Vasu V", "Security", 20));
		empList2.add(new Employee("Amar", "Entertinment", 12500));

		// List to Map
		Map<String, String> aa = empList.stream().collect(Collectors.toMap(Employee::getName, Employee::getAccount));

		aa.forEach((k, j) -> System.out.println("lll" + j));

		// Matches

		/*
		 * List<Employee> a = empList2.stream() .filter(emp2 ->
		 * empList.stream().anyMatch( emp.getSalary().equals("Accounts") && emp ->
		 * emp.getSalary().equals(emp2.getSalary()))) .collect(Collectors.toList());
		 * 
		 * 
		 * a.stream().forEach(resutl -> { if (resutl.toString().equalsIgnoreCase("aa"))
		 * {
		 * 
		 * } else { System.out.println("matches" + resutl); } });
		 * 
		 * }
		 * 
		 * 
		 * 
		 * List<Employee> filteredList = emplList.stream() .filter(empl ->
		 * deptList.stream().anyMatch( dept -> dept.getDepartment().equals("sales") &&
		 * empl.getEmployeeId().equals(dept.getEmployeeId())))
		 * .collect(Collectors.toList());
		 */
		 
	}

}
