package geekster;
import java.util.*;

public class Table {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number");
		int n =sc.nextInt();
		sc.close();
		
		for(int i=1; i<=10; i++) {
			int t = n*i;
			System.out.println(n+" * "+i+" = "+t);
		}
	}

}
