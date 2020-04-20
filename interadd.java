import java.io.*;
import java.util.*;
interface operation
{
 public int add(int a,int b);
           }
 
 class addition implements operation
{
  public  int add(int x,int y)
 {
        return(x+y);
       }
 
 
 }
 class interadd
 {
   public static void main(String args[])
   {
       addition a=new addition();
       System.out.println("enter two values"); 
       Scanner s=new Scanner(System.in);
        int x=s.nextInt();
       int y=s.nextInt();
      System.out.println(a.add(x,y));
       
   }
   }
 
	