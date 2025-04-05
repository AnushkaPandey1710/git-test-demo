package programming.stream.example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

	public static List<Employee> evaluateTaxUser(String input) {

		return input.equalsIgnoreCase("tax")
				? EmployeeDAO.getEmployees().stream().filter(i -> i.getSalary() > 5000000).collect(Collectors.toList())
				: EmployeeDAO.getEmployees().stream().filter(i -> i.getSalary() <= 5000000)
						.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		System.out.println(evaluateTaxUser("non tax"));
	}
}
