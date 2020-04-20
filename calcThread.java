import java.util.*;
import java.io.*;
import java.lang.Runnable;
class add implements Runnable
{
     int a,b;
add(int a,int b)
{
    this.a=a;
    this.b=b;
}
public void run()
{
System.out.println("thread of add running");
int result=cal( );
System.out.println("sum is:"+result);
}
int cal()
{
  return a+b;
}
class sub implements Runnable
{    int a,b;
    sub(int a,int b)
    {this.a=a;
      this.b=b;
    }
  public void run()
{
System.out.println("thread of sub running");
subb r=new subb(a,b);
int res=r.cal();
System.out.println("sub is :"+res);
  }
}
class subb
{
 int a,b;
subb(int a,int b){
this.a=a;
this.b=b;
 }
int cal(){
return a-b;
}
}
public class calcThread
{
public static void main(String args[])
{
System.out.println("enter numbers");
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int y=s.nextInt();
add f=new add(2,4);
add o=new add(4,4);
Thread t1=new Thread(f);
t1.start();
Thread t=new Thread(o);
t.start();
sub g=new sub(x,y);
Thread t2=new Thread(g);
t2.start();
}
}



 



}
