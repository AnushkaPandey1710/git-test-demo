package programming.stream.flatmap;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class OptionalDemo {

	public static void main(String[] args) {
		
		

	    Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum= A.length()+B.length();
        System.out.println(sum);
        if(A.compareTo(B)>=0){
            System.out.println("No");
        }
        else
        System.out.println("Yes");
        
        String a= A.substring(0,1).toUpperCase()+A.substring(1);
        String b= B.substring(0,1).toUpperCase()+ B.substring(1);
        System.out.println(a+" "+b);
    }
	
}
