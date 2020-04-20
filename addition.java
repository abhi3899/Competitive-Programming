import java.io.*;
import java.util.*;
class addition
{
public static void main(String args[ ])
     {int a=10;
      int b=10;
       operation o=new operation();
       int d= o.add(a,b);
       System.out.println(d);

        }
}

class operation
{
	int add(int x , int y)
	{
		return x+y;	
	}
}
