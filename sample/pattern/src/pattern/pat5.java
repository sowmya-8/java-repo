package pattern;

public class pat5 {

	public static void main(String[] args) {
		/*
		 * *********************
		 * *                   *
		 * *                   * 
		 * *                   *
		 * *                   *
		 * *                   *
		 * *                   *     
		 * *                   *
		 * *                   *
		 * *********************
		 */
		for(int rows=1;rows<=10;rows++) {
			
			
			System.out.print("\t");
			
			if(rows == 1 || rows == 10) {
				for(int cols=1;cols<=20;cols++) {
					System.out.print("*");
				}
			}
			else {
				for(int cols=1;cols<=20;cols++) {
					if(cols== 1 || cols == 20) {
						System.out.print("*");	
					}
					else {
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();
		}
		
		
		
		
	}

}
