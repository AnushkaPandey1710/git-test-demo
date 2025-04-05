package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printAllNumbersInListSTructured(List.of(12, 4, 2, 23,78,14,17));
	}

	private static void printAllNumbersInListSTructured(List<Integer> numbers) {
		
		// how to loop the  numbers
		for(int num:numbers) {
			System.out.println(num );
		}
		
	}

}
