package firstloop;

public class firstloop {

	public static void main(String[] args) {
		int n = 8917,rem,z=1,t;
		
		t=n;
		while(n != 0) {
			n = t;
			
		}
		z = z / 10;
		n = t;
		while(n != 0) {
			rem = n /z;
			n = n % z;
			z = z / 10;
			System.out.println(rem);
			
		}
		
	}
	
}


