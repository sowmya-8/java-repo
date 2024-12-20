package replaceNo;

public class oneloop {

	public static void main(String[] args) {
		//print 2 times hello
		//print 3 times hyd
		//print 5 times welcome
		//in a single loop
		for(int x=1,y=1,z=1;z<=5;x++,y++,z++){
			if(x<=2)System.out.println("hello");
			if(y<=3)System.out.println("hyd");
			System.out.println("welcome");
		}
	}

}
