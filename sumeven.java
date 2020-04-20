import java.io.*;
import java.util.*;
class sumeven
{
   public static void main(String args[ ])
  {
  int[ ] a= new int[10];
  Scanner s=new Scanner(System.in);
 int n=a.length;
for (int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
     }
  int sum=0;
   for (int i =0;i<=n;i=i+2)
{
    if(a[i]%2==0)
  {
     sum=sum+a[i];
  }
else 
{
    continue;
}
}
System.out.println(sum);
}
}