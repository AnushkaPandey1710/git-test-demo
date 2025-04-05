package programming.corejava;

import java.util.*;
import java.security.*;

public class Geeks {
	public static void main(String[] args) {

		

		
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			String s=Integer.toString(n);

			// Write your code here

			if (n == Integer.parseInt(s) && n>=-100 && n<101) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		
	}
}

