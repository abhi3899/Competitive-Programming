import java.io.*;
import java.util.*;

class insertionsort
{
     public static void main(String args[])
      {
          int n=1000;
          int a[ ]=new int[ n];
         int l=n;
         for (int i=0;i<n;i++)
           {
               a[i]=l-- ;
           }
             long starttime=System.nanoTime();
           for ( int k=1;k<=n-1;k++)
           {
              int key=a[k];
             int  j=k-1;
           while(j>=0 && a[j]>key)
          {
             a[j+1]=a[j];
             j=j-1;
          }
            a[j+1]=key;
         }
       long endtime=System.nanoTime();
       long time=endtime-starttime;
        
     
     for (int v=0;v<n;v++)
      {
         System.out.print(a[v]+" ");
       }
       System.out.println(time);
}
}