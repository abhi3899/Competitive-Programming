import java.util.*;
import java.io.*;
class exponent1
{
    static int exponential(int x,int n)
	{
	   if (n==0)
	   {
	     return 1;
		}
		 else
		 {
		 int r=exponential(x,n/2);
		 if (n%2==0)
		 {
		 return r*r;
		 }
		 else{
		 return r*r*x;
		 }
		 }
	}
	public static void main(String args[])
	{
	System.out.println(exponential(2,3));
	}
}