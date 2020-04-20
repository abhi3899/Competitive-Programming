import java.io.*;
import java.util.*;
class monoalphabetic
{    public static void main(String args[])
	{   
	
     	 Scanner sc=new Scanner(System.in);
     	Scanner s=new Scanner(System.in);
     	System.out.println("Length of string:  ");
     	int n=sc.nextInt();
     	System.out.println("Enter string:  ");
     	String d=s.nextLine();
     char[] a=d.toCharArray();
     char[] key={'Z','Y','X','W','V','U','T','R','S','Q','P','O','L','N','M','K','J','H','I','G','F','E','D','C','B','A'};
     System.out.println("Encrypted string:");
     for(int i=0;i<n;i++)
     {  
     	int c=a[i];
     	int x=(c-65);
     	a[i]=key[x];
        System.out.println(a[i]);
         
        }
        System.out.print("\nDecrytped");
        for(int i=0;i<n;i++)
        { for(int j=0;j<26;j++)
            { if(a[i]==key[j])
            	{
            		int m=j+65;
            		System.out.print("\n"+(char)m);
            	
            	}


            }
          
          




        }
  }
}