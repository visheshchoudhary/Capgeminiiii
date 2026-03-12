package Day13_Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queues {

	public static void main(String[] args) {
PriorityQueue p=new PriorityQueue();
p.add(10);
p.add(2);
p.add(7);
p.add(9);
//System.out.println("-----Remove----");
//System.out.println(p.remove());
//System.out.println(p.remove());
//System.out.println(p.remove());
//System.out.println(p.remove());
//System.out.println(p.remove());

//System.out.println("----Poll----");
//System.out.println(p.poll());
//System.out.println(p.poll());
//System.out.println(p.poll());
//System.out.println(p.poll());
//System.out.println(p.poll());

//p.clear();
//System.out.println("----Element----");
//System.out.println(p.element());
//System.out.println(p.element());
//System.out.println(p.element());
//System.out.println(p.element());
//System.out.println(p.element());

//System.out.println("----peek----");
//System.out.println(p.peek());
//System.out.println(p.peek());
//System.out.println(p.peek());
//System.out.println(p.peek());
//System.out.println(p.peek());
int a=0;
System.out.println("----for Each----");
for(Object k:p)
{
a=a+(int)k;
System.out.println(k+", ");	
//System.out.println("a - "+a);
}
System.out.println("----Iterator----");

Iterator i=p.iterator();
//System.out.println(i.hasNext());
//System.out.println(i.next());
//System.out.println(i.hasNext());
//System.out.println(i.next());
//System.out.println(i.hasNext());
//System.out.println(i.next());
//System.out.println(i.hasNext());
//System.out.println(i.next());
//System.out.println(i.hasNext());
//System.out.println(i.next());
while(i.hasNext())
{
	System.out.println(i.next());
}
System.out.println(p);
	}
}