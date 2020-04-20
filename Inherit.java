/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABHINAV
 */
import java.io.*;
import java.util.*;
class rectangle
{
    int l,b;
    void get(int x,int y)
    { this.l=x;
       this.b=y;
    
    }
    int area()
    { 
       return(l*b);
    }
        
}
class roundrectangle extends rectangle
{
    float r;
    void  rget(float x)
    {this.r=x;}
    float rarea()
    {
        //rectangle r=new rectangle();
        float a=area() -(float)( 4*((r*r)-((3.14*r*r)/4)));
        return(a);
    }
    
}
public class Inherit {
    public static void main(String args[]) 
    {    Scanner s =new Scanner (System.in);
      System.out.println("Enter values of l and b and r");
         int len=s.nextInt();
         int breadth=s.nextInt();
         float rad=s.nextFloat();
         roundrectangle r=new roundrectangle();
         r.get(len, breadth);
         r.rget(rad);
         System.out.println(r.area());
         System.out.println(r.rarea());
      
        
    }
}
