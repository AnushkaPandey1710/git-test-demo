package programming.stream.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDAO {

	public static List<Customer> getAll(){
		return Stream.of(
				new Customer(101,"Anushka","abc@gmail.com",Arrays.asList("21212","121212")),
				new Customer(101,"Ira","asjasasc@gmail.com",Arrays.asList("97878","545454")),
				new Customer(101,"Rahul","kdhdh@gmail.com",Arrays.asList("32424","465656")),
				new Customer(101,"Sameer","retet@gmail.com",Arrays.asList("12212","4343")),
				new Customer(101,"Ebu","bcgd@gmail.com",Arrays.asList("6778","789"))
				).collect(Collectors.toList());
	}
}
