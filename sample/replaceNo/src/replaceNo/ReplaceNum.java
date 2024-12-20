package replaceNo;

import java.util.Scanner;

public class ReplaceNum {

	public static void main(String[] args) {
		int r,p=1,res=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		while(n!=0) {
			r = n % 10;
			if(r==9) r=3;
			n = n/10;
			res = res + r * p;
			p = p * 10;
		}
		System.out.println(res);
	}
}
