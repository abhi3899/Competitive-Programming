import java.io.*;
import java.util.*;
class overload
{   
      public static void main(String args[])
      {
          int l=5;
         int b=4;
         int h=3;
            operation o=new operation();
            int v=o.volume(l,b,h);
                System.out.println("volume of box"+v);
             operation d=new operation();
                float f=d.volume(l,b);
               System.out.println("volume of box"+f);
       }
              
}
class operation
{
       int volume(int a,int b,int c)
       {
             return(a*b*c);
         }
       float volume(int a,int b)
         {
             return((float)(3.14*a*a*b));
       }
}
       