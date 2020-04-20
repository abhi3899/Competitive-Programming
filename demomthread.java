import java.io.*;
import java.util.*;
class add implements Runnable
{   int a,b;
    add(int a,int b)
      { this.a=a;
        this.b=b;
        }
  public void  run()
{  
for(int i=0;i<5;i++){
System.out.println(a+b);
  try{Thread.sleep(1000);} catch(Exception e){}
}
}
}
class sub implements Runnable
{   int a,b;
    sub(int a,int b)
      { this.a=a;
        this.b=b;
        }
  public void  run()
{  
for(int i=0;i<5;i++){
System.out.println(a-b);
  try{Thread.sleep(1000);} catch(Exception e){}
}
}
}
class demomthread{
public static void main(String args[])
{add o1=new add(5,2);
  sub o2=new sub(5,2);
  Thread t1=new Thread(o1);
  Thread t2=new Thread(o2);
t1.start();
t2.start();

}
}