import java.io.*;
import java.util.*;
class demofibo
{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	long a=System.nanoTime();
	fibo(n);
	long b=System.nanoTime();
	long c=b-a;
	System.out.println(c); 
System.out.println(fibo(n));
}
static int fibo(int n)
{
	if(n<=1)
	{
		return(n);

	}
	else{
		return(fibo(n-1)+fibo(n-2));
	}
} 


}