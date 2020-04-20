import java.io.*;
import java.util.*;
class ceaser
{    public static void main(String args[])
	{   
	
     	 Scanner sc=new Scanner(System.in);
     	Scanner s=new Scanner(System.in);
     	System.out.println("Length of string:  ");
     	int n=sc.nextInt();
     	System.out.println("Enter string:  ");
     	String d=s.nextLine();
     char[] a=d.toCharArray();
    
System.out.println("Enter key:");
     int key=sc.nextInt();
               System.out.println("cipher code:");
      
            for (int i=0;i<n;i++)
		{   
			
              int v=a[i];
              int text=(((v+key-65)%26)+65);
              char ch=(char)text;
	            System.out.println(ch);

	    }
	    System.out.println("Decrytped code:");
	          for(int i=0;i<n;i++) 
	          	{
	          		int v=a[i];
                    int text=(((v+key-65)%26)+65);
                    char p_text=(char)(((text-key-65+26)%26)+65);
	                 System.out.println(p_text);
	             }
	            



              
      }
}





