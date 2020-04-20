class Race

{

public static void main(String[] args)

{

operation r1=new operation("Turtle",1);

Thread t1=new Thread(r1);

operation r2=new operation("Rabbit",10);

Thread t2=new Thread(r2);

t1.start();

t2.start();

}

}
class operation implements Runnable
{
String player;
static int covered=0;
int speed;
operation(String name,int speed)
{
      this.player=name;
       this.speed=speed;

}

public void run()

{

System.out.println("I am "+player+" with speed "+speed);

while(this.covered<1000)

{


if(player.equals("Turtle"))
{
covered=covered+1;

System.out.println("Covered Turtle distance: "+covered);
if(covered>=1000){
System.out.println(player+" completed the race");
   }
}
if((player.equals("Rabbit")))
{
covered=covered+10;
System.out.println("Covered Rabbit distance: "+covered);
if(covered>=1000){
System.out.println(player+" completed the race");
}
}
if((player.equals("Rabbit"))&&(covered=900))
try 
{
sleep(99999);
covered=covered+10;
}

catch (InterruptedException ex) 
{
System.out.println("Exception");

}
}
}
}
