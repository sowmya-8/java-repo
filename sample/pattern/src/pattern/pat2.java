package pattern;

public class pat2 {

	public static void main(String[] args) {
		/*
		 *        1
		 *       2 2
		 *      3 3 3
		 *     4 4 4 4
		 *    5 5 5 5 5
		 */
		int max=50;
		for(int r=1;r<=5;r++) {
			for(int s=1;s<=max;s++) {
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++) {
				System.out.print(r+" ");
			}
			System.out.println();
			max = max -1;
		}

	}

}

