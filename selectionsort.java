import java.io.*;
import java.util.*;
class operation
{ 
      public void sort(int a[  ])
    {
       int n=a.length;
       for(int i=0;i<n;i++)
       {
         int m=i;
        for (int j=i+1;j<n;j++)
        {
          if(a[j]<a[m])
          {
               m=j;
           
                
          }   

           }
  int temp=a[m];
                a[m]=a[i];
                 a[i]=temp;
         }
      }
         public void p(int a[ ])
      {
         int n=a.length;
         for (int i=0;i<n;i++)
         {
             System.out.print(a[i]+"  ");
           }
      }
}
             
class selectionsort
{
     public static void main(String args[])
      {
          int f=1000;
          int a[ ]=new int[ f];
         int l=f;
         for (int i=0;i<f;i++)
           {
               a[i]=l-- ;
           }
                 
         operation o=new operation();
          long starttime=System.nanoTime();
            o.sort(a);
          long endtime=System.nanoTime();
          long time=endtime-starttime;
           
           System.out.println("sorted array" );
         // o.p(a);
           System.out.println(time);
            }      
 }
         
         
         