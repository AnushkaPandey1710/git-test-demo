package programming.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest{


	 public static void main(String[] args) {
		Consumer<Integer> consumer=(i)->System.out.println("Printing : " + i);
		consumer.accept(10);
		
		List<Integer> list= Arrays.asList(1,2,3,4,5);
		list.forEach((i)->System.out.println("Print : " +i));
	}

}
