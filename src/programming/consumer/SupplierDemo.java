package programming.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo{

	public static void main(String[] args) {
		Supplier<String> supp=()->"Hello";
		System.out.println(supp.get());
		
		List<String> list= Arrays.asList("a","b","c","d");
		System.out.println(list.stream().findAny().orElseGet(()->"Hello"));
	}

}
