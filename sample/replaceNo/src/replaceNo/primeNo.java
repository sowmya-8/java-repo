package replaceNo;

import java.util.Scanner;

public class primeNo {

	public static void main(String[] args) {
		//check if the scanner input is a prime number or not
		//ex-13
		Scanner ab = new Scanner(System.in);
		System.out.println("enter a random number");
		int n = ab.nextInt();
		
		int r;
		int i = 2;
		for(;i<=n/2 && (n % i != 0);i++);
		if((n / 2) == i)System.out.println("is prime");
		System.out.println("not prime");
		}
	}

