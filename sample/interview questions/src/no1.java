
public class no1 {

	public static void main(String[] args) {
		
		//readonly
		//immutable
		
		String data1 = "Hello";
		String data2 = "Hello";
		String data30 = "Hello";
		
		if(data30 == data2) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not");
		}
		
		String data3 = new String("Hello");
		String data4 = new String("Hello");
		
		if(data1 == data4) {
			System.out.println("from new Same");
		}
		else {
			System.out.println("from new Not");
		}

	}

}
//when new operator is used it will be false
//but will be true if we will not use the new operator  
