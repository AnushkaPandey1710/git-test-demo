package programming.stream.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	
	public static List<Employee> getEmployees(){
		List<Employee> employees= new ArrayList<>();
		employees.add(new Employee("Anushka", "Technology", 4000000));
		employees.add(new Employee("Rani", "Technology", 4000000));
		employees.add(new Employee("Rahul", "Cyber", 7000000));
		employees.add(new Employee("Ira", "Astro", 10000000));
		employees.add(new Employee("Lax", "Astro", 10000000));
		employees.add(new Employee("Sameer", "Business", 15000000));
		return employees;
	}
}
