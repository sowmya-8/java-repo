package pattern;

public class pat9 {

	public static void main(String[] args) {
		/*
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 * 11 12 13 14 15
		 * 
		 */
		for(int r=1,n=1;r<=5;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print(n++ +" ");
			}
			System.out.println();
		}

	}

}
