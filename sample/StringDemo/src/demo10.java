import java.util.Scanner;

public class demo10 {

	public static void main(String[] args) {
		
		// palindrome or not
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter data");
		String data = sc.next();
		
		char ch;
		String newStr = "";
		for(int i=data.length()-1;i>=0;i--) {
			ch = data.charAt(i);
			newStr = newStr + ch;
		}
		System.out.println("data from keyboard ---->"+data);
		System.out.println("new Str ---->"+newStr);
		if(data.contentEquals(newStr) == true) {
			System.out.println("yes it is a Palindrome");
		}
		else {
		System.out.println("No it is not a Palindrome");
		}
		sc.close();

	}

}
