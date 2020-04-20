import java.util.*;
import java.io.*;
import java.lang.math;
class loops2
{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
       int a,b,n;
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
             n = in.nextInt();
            cal(this.a , this.b , this.n);
           }
        
    }
     public  int cal(int a ,int b ,int n)
               {
             int p=(a+(pow(2,n-2)*b))+(a+(pow(2,n-1)*b));
             return  p;
                 }
}

