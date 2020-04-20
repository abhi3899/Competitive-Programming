import java.io.*;
import java.util.*;
class demofact
{
	public static void main(String args[])
	{int fact=1;
	
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		long b=System.nanoTime();
		fact(a);
		long c=System.nanoTime();
		long d=c-b;
		System.out.println("Time taken ="+d);
		System.out.println("factorial ="+fact(a));

	

	}
	 static int fact(int a){
		if (a==1)
		{
			return 1;
		}
		else {
	return(a*fact(a-1));
              }
}
}