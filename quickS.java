import java.io.*;
import java.util.*;
class quickS
{ 
     public static void main(String args[ ]) 
  {
      int n=10;
        int a[]=new int[n];
       for(int i=0;i<n;i++,n--)
       {
           a[i]=n;
        }  
      int min=0;
int max=n-1;
sort(a,min,max);
for (int i=0;i<n;i++ )
{
 System.out.println(a[i]);
}

}
 static void sort(int a[ ],int min,int max)
{ 
min=0;
int pivot=min;
int n=10;
      while(a[pivot]>=a[min])
     { 
        min+=min;
     }
     while (a[pivot]<a[max])
  {
        max-=max;
   }
  if (min<max)
{
 int temp=a[min];
a[min]=a[max];
a[max]=a[min];    
}
else
{
  int temp=a[pivot];
a[pivot]=a[max];
a[max]=temp;
}

sort(a,min, max-1);
sort(a ,max+1,n-1);
}
}
  
