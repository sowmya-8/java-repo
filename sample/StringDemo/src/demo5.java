import java.util.Scanner;

public class demo5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any two random names");
		
		String n1 = sc.next();
		String n2 = sc.next();
		
		System.out.println("\n---before concatenation---");
		System.out.println("name1-->"+n1);
		System.out.println("name2-->"+n2);
		
		String name;
		
		name = n1+n2;
		
		System.out.println("\n---after concatenation---");
		System.out.println(name);
		

	}

}
