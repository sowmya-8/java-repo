
public class demo6 {

	public static void main(String[] args) {
		
		// converting first character of the string to upper case
		
		String name = "somu";
		
		char ch = name.charAt(0);
		int diff = (int)('A'-'a');
		
		diff = diff<0?-1  * diff:diff;
		
		if(ch >='a' && ch <='z') {
			ch = (char)(ch -diff);
		}
		System.out.println(ch);

	}

}
