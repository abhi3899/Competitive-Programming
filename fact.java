import java.io.*;
import java.util.*;
class fact
{
      
           public static void main(String args[ ] )
           {
              Scanner s=new Scanner(System.in);
               int n=s.nextInt();
	operation o=new operation();
                int f=o.factorial(n);
                System.out.println(f);
             }
}
 
class operation
{

	 int factorial(int n)
         { 
               if (n==0)
             { 
                      return (1);
              }
                else
             {  
                 return (n*factorial(n-1)) ;
              }
          }
}          
            