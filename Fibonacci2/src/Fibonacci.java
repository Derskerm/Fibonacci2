/**
 * @(#)Fibonacci.java
 *
 *
 */

import java.util.Scanner;

public class Fibonacci {

	//20th Fibonacci number is 6765
    public static int computeFibonacci(int x) {

    	if (x <= 1) {
    		return x;
    	} else {
    		int answer = computeFibonacci(x-2) + computeFibonacci(x-1);
    		return answer;
    	}

    }

	public static void main (String[] args) {
		Scanner kboard = new Scanner (System.in);
		System.out.print("Which fibonacci number would you like to find? --> ");
		int x = kboard.nextInt();
		int answer = computeFibonacci(x);
		System.out.println ("The " + x + " fibonacci number is " + answer + ".");
	}

}



