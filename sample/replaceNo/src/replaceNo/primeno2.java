package replaceNo;

import java.util.Scanner;

public class primeno2 {
	
	public static boolean isprime(int n) {
		int i=2;
		for(;i<=n/2 && (n%i !=0);i++);
		if((n / 2) == i) return true;
		else return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a random number");
		int n=sc.nextInt();
		if(isprime(n)==true)System.out.println("is prime");
		else System.out.println("not prime");
	}

}