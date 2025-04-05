package programming.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import programming.stream.example.Employee;
import programming.stream.example.EmployeeDAO;

public class ListSortDemo {

	public static void main(String[] args) {

		List<Integer> lists = new ArrayList<>();
		lists.add(23);
		lists.add(56);
		lists.add(12);
		lists.add(21);
		lists.add(67);
		lists.add(65);

System.out.println(lists.stream().sorted().toList());
//	lists.stream().sorted().forEach(s->System.out.println(s));
//	lists.stream().sorted(Collections.reverseOrder()).forEach(s->System.out.println(s));

		List<Employee> employeeList = EmployeeDAO.getEmployees();
//		Collections.sort(employeeList, (o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
//
//		employeeList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
//				.forEach(s -> System.out.println(s));
	employeeList.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
//		employeeList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
//
//		  List<Employee> employees = new ArrayList<>();
//	        employees.add(new Employee("John", 50000));
//	        employees.add(new Employee("Alice", 60000));
//	        employees.add(new Employee("Bob", 50000));
//	        employees.add(new Employee("Charlie", 70000));
//	        employees.add(new Employee("David", 50000));
//
//	        // Sorting using streams
//	        List<Employee> sortedEmployees = employees.stream()
//	                .sorted(Comparator.comparingLong(Employee::getSalary)
//	                                  .thenComparing(Employee::getName))
//	                .collect(Collectors.toList());
	        
	        employeeList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed().thenComparing(Employee::getName)).forEach(System.out::println);
	        
	}

}
