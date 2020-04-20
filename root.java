import java.io.*;
import java.util.*;
class root
{
  public static void main(String args[ ])
  {
      int s=1,r=0;
      int a=11;
      int f=0;
      int end =a;
     while(s<=end)
      {
int mid=(s+end)/2;
if (mid*mid==a)
{   
f=mid;
break;
}       
 
if (mid  *mid<a)
{
s=mid+1;
f=mid;
}
else
{ 
      end=mid-1;
}
}
System.out.println(f);
}
}