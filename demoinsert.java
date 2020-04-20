import java.io.*;
import java.util.*;
class demoinsert
{
public static void main(String args[]){
int[ ] a={5,4,3,2,6,1,8};
int n=a.length;
int key=0;
int j;
for (int i=1;i<n;i++)
{   key=a[i];
   j=i-1;
   while(j>0 &&key<a[j]){
     a[j+1]=a[j];
      j=j-1;
}
a[j+1]=key;
}
for (int i=1;i<n;i++)
{
System.out.println(a[i]);

}
}
}