import java.io.*;
import java.util.*;
interface operation
{
 public int add(int a,int b);
 }
 
 class addition implements operation{
  public  int add(int x,int y)
 {return(x+y);
 }
 
 
 }
 class inter
 {
   public static void main(String args[])
   {
       addition a=new addition();
	   System.out.println(a.add(4,5));
   }
   }
 
	  