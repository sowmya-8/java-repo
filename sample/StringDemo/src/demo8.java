import java.util.Scanner;

public class demo8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some random data which contains lower case and upper case letters,etc...");
		String name = sc.next();
		
		char eachChar;
		int diff = (int)('d'-'D');
		diff = diff<0?-1 * diff:diff;
		
		String resStr = "";
		
		for(int i=0;i<name.length();i++) {
			eachChar = name.charAt(i);
			 if(eachChar >='a' && eachChar <='z') {
				 eachChar = (char)(eachChar - diff);
			 }//if
			 else if(eachChar >='A' && eachChar <='Z') {
				 eachChar = (char)(eachChar + diff);
			 }//if
			 resStr = resStr+eachChar;
		}// for
		System.out.println("res---->"+resStr);

	}

}
