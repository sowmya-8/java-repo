import java.util.Scanner;

public class demo7 {

	public static void main(String[] args) {
		// changing the whole string into upper case
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name in lower case");
		String name = sc.next();
		
		char ch;
		int diff = (int)('d'-'D');
		
		diff = diff<0?-1  * diff:diff;
		String resStr = "";
		
		for(int i=0;i<name.length();i++) {
			ch = name.charAt(i);
			if(ch >='a' && ch <='z') {
				ch = (char)(ch -diff);
			}
			resStr = resStr+ch;
		}
		System.out.println("res-->"+resStr);


	}

}