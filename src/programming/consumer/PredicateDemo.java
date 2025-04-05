package programming.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> predicate = t -> t % 2 == 0;
		System.out.println(predicate.test(20));

		List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		lists.stream().filter(i -> i % 2 == 0).forEach(i->System.out.println("print : "+i));
	}

}
