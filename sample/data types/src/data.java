import java.util.Scanner;

public class data {

	public static void main(String[] args) {
		
		Scanner xy = new Scanner(System.in);
		System.out.println("enter numeric value:");
		char ch = xy.next().charAt(0);
		
		if( (ch >= '0') && (ch <= '9') ){
			System.out.println("yes it is numeric");
		}
		else {
			System.out.println("no it is not numeric");
		}
	}
	
}
 