package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> courses= List.of("Spring","Spring Boot","AWS","Azure","DevOps","API");
		System.out.println("checking with git demo");
		printCourses(courses);
	//	printOddNumbersInListFunctional(List.of(12, 4, 2, 23, 78, 14, 17));
		//printSquareOfEvenNumbersInListFunctional(List.of(12, 4, 2, 23));
	}

	private static void printCourses(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream()
		.forEach(System.out::println);
		
		courses.stream()
		.filter(course->course.contains("Spring"))
		.forEach(System.out::println);
		
		
		courses.stream()
		.filter(course->course.length()>=4)
		.forEach(System.out::println);
		
		
		courses.stream()
		.map(course->course +" " +course.length())
		.forEach(System.out::println);
		
		
		
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {

		// what to do

		numbers.stream().forEach(System.out::println);

	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

		// what to do

		numbers.stream().filter(num -> num % 2 == 0) // Filter-- only allow even number used Lambda expression
				.forEach(System.out::println);// Method reference

	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {

		// what to do

		numbers.stream().filter(num -> num % 2 != 0) // Filter-- only allow even number used Lambda expression
				.forEach(System.out::println);// Method reference

	}
	
	private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {

		// what to do

		numbers.stream()
				.filter(num -> num % 2 == 0) // Filter-- only allow even number used Lambda expression
				.map(nu->nu*nu)
				.forEach(System.out::println);// Method reference

	}
}
