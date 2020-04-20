import java.io.*;
import java.util.*;
class Test
{
static int i;
int j;
static {
i=10;
System.out.println("Static block called");
}
 void test()
      {System.out.println("constructor called");
      }
}
class smain{
public static void main( String args[ ]){
Test o1=new Test();
Test o2=new Test ();
}
}