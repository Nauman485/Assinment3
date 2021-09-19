package geekster;
import java.util.*;

public class Fabonacci {
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int a = 1,b=1,c,i=2;
		System.out.println("Enter the number");
		int n = sc.nextInt();
		sc.close();
		System.out.print(a+",");
		System.out.print(b);
		
		while(i<n)
		{
		c =	a+b;
		System.out.print(","+c);
		a = b;
		b = c;
		i++;
		}
	}

}
