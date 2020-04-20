import java.io.*;
import java.util.*;
class arrobj
{
    public static void main(String args[ ])
   {       obj o[ ]=new obj[5];
            int r,a;
             String n;
        for(int i=0;i<5;i++)
       {  
          o[i]=new obj();
         System.out.print("enter rollnumber");
          Scanner s=new Scanner(System.in);
            r=s.nextInt( );
           System.out.print("enter age");   
           Scanner s1=new Scanner(System.in);
             a=s1.nextInt( );
           System.out.print("enter name");
           Scanner s2=new Scanner(System.in);
            n=s2.next( );
            o[i].details(r,a,n);
       }
          for (int i=0;i<5;i++)
          {
                 o[i].display();
           }
    }
}
 class obj
{
   int rno,age;
   String name;
   void details(int r,int a, String n)
   {
       rno=r;
       age=a;
        name=n;
    
    }
 void display()
{
   System.out.println(rno);
   System.out.println(age);
   System.out.println(name);
  }
}    








          






      