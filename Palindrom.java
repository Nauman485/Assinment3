package geekster;
import java.util.*;

public class Palindrom {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		sc.close();
		String str2="";
		for(int i=str.length()-1; i>=0; i--) {
			str2+=str.charAt(i);
		}
		if(str2.equals(str)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
