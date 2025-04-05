package programming.stream.flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<Customer> customerList= CustomerDAO.getAll();
		List<String> emails=customerList.stream().map(cust->cust.getEmail()).collect(Collectors.toList());
		System.out.println(emails);
		
		
		//with map
		List<List<String>> phoneList= customerList.stream().map(cust->cust.getPhoneNumber()).collect(Collectors.toList());
		System.out.println(phoneList);
		//withflatMap
		
		List<String> phoneNumbers=customerList.stream().flatMap(cust->cust.getPhoneNumber().stream()).collect(Collectors.toList());
		System.out.println(phoneNumbers);
		
	}
}
