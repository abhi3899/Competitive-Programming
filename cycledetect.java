import java.io.*;
import java.util.*;
class cycledetect
{
int V; 
final List<List<Integer>>adj;
public cycledetect(int V)
{
this.V=V;
adj=new ArrayList<>(V);
for(int i=0;i<V;i++)
   { adj.add(new LinkedList<>( ));}
}
public boolean isCyclicU(int i,boolean[ ] visited  ,boolean[ ] recStack )
{

if(recStack[ i ])
  {return true;}
if(visited[ i ])
  {return false;}
visited[i]=true;
recStack[i]=true;
List<Integer>children=adj.get(i);
for (Integer c: children)
{ if(isCyclicU(c,visited,recStack))
     return true;
  }
recStack[i]=false;
return false;
}
public void addEdge(int source ,int dest)
{
  adj.get(source).add(dest);
}
public boolean isCyclic()
{boolean[ ]visited=new boolean[V];
boolean[ ] recStack=new boolean[V];

for (int i=0;i<V;i++)
{
      if(isCyclicU(i,visited,recStack))
        { return true;}
}
return false;
}
public static void main(String args[])
{
cycledetect graph=new cycledetect(4);
graph.addEdge(0,2);
graph.addEdge(0,1);

graph.addEdge(0,3);

graph.addEdge(1,3);

graph.addEdge(2,1);

if(graph.isCyclic())
   System.out.println("graph has cycle");
else
System.out.println("not containing cycle");

}

}



 