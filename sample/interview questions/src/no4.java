import java.util.Scanner;

public class no4 {

	public static void main(String[] args) {
		
		//java program to check whether the two strings are anagram
		//size should be same 
		//ex - listen silent
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two strings");
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		char eachCh = ' ';
		
		boolean isAnagram = false;
		if(str1.length() == str2.length()) {
			
		}
			for(int i=0;i<str1.length();i++) {
				eachCh = str1.charAt(i);
				if(isCharThere(str2,eachCh) == true) {
					isAnagram = true;
				}
				else {	
					isAnagram = false;
					break;
				}
			}
	
	if(isAnagram == true) {
		System.out.println("Yes it is Anagram");
	}
	else {
		System.out.println("Not Anagram");
	}

}

	private static boolean isCharThere(String str2, char eachCh) {
		char localCh = ' ';
		for(int i=0;i<str2.length();i++) {
			localCh = str2.charAt(i);
			if(localCh == eachCh) {
				return true;
			}
		}
		
		
		return false;
		
	
	}
}

