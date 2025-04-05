package programming;

interface Calculator {
	// void print();
	//void sum(int i, int j);
	
	int multiply(int i, int j);
}

public class LambdaTest {

	public static void main(String[] args) {
//		Calculator cal=()->System.out.println("Inside Caluclator");
//		cal.print();

//		Calculator cal = (i, j) -> {
//			int x = i + j;
//			System.out.println(x);
//		};
//		cal.sum(10, 20);
		
		
		Calculator cal=(i,j)-> i*j;
		System.out.println(cal.multiply(2, 3));
		
	}
}
