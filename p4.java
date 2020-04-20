import java.io.*;
import java.util.*;
class c1 implements Runnable
{
  public void  run()
{  
for(int i=0;i<5;i++){
System.out.println("i am thread 1");
  try{Thread.sleep(200);} catch(Exception e){}
}
}
}
class c2 implements Runnable
{
  public void  run()
{  
for(int i=0;i<5;i++){
System.out.println("I am thread 2");
  try{Thread.sleep(400);} catch(Exception e){}
}
}
}
class p4{
public static void main(String args[])
{c1 o1=new c1( );
  c2 o2=new c2( );
  Thread t1=new Thread(o1);
  Thread t2=new Thread(o2);
t1.start();
t2.start();

}
}