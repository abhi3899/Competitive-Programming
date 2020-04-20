import java.io.*;
import java.util.*;
class demopower {
	static int pow(int a,int b)
	{
		if(b==0)
		{
			return 1;

		}
		else  if (b%2==0)
		{
			return(pow(a,b/2)*pow(a,b/2));
		}
		else
		{
			return(a*pow(a,b/2)*pow(a,b/2));
		}
	}
	public static void main(String args[])
	{
		int a=5;;
		int b=3;
		System.out.println(pow(a,b));
	} 

}