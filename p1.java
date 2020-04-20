import java.util.*;
class rectangle
{
     float l;
     float b;
    float p;
    float a;
    void get(float l,float b)
{
this.l=l;
this.b=b;

}
    
public void area( )
{ a=l*b;
   System.out.println( "area r:"+a);
}
}
class roundrect extends rectangle{
float r;
   void rget(float r)
{
this.r=r;}

void carea()
{  float ac=a-(float)( 4*((r*r)-((3.14*r*r)/4)));
     System.out.println( "area"+ac);
}
class p1
{   public static void main(String args[]) 
float l=5;
float b=4;
float r=3;
roundrect e=new roundrect();
r.get(l,b);
r.rget(r);
System.out.println( r.area());
System.out.println( r.carea());
}

}







}
      

