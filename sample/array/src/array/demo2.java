package array;

public class demo2 {

	public static void main(String[] args) {
		
		int[] num = {10,2,3,67,90,100,31,44,66,77};
		int max = num[0];
		
		for(int a=1;a<num.length;a++) {
			if(num[a] > max) {
				max = num[a];
			}
		}
		System.out.println("max--->"+max);

	}

}
