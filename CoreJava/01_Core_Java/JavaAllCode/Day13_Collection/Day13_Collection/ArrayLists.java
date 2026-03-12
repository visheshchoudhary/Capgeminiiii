package Day13_Collection;
import java.util.ArrayList;
public class ArrayLists {
	public static void main(String[] args) {
ArrayList al=new ArrayList();
al.add(10);
al.add("Anshul");
//al.add("Nityam");
//al.add("Khushi");
//al.add(90);
//al.add("Raju");
//al.add("Anjan");
//al.add("Khushi");
//al.add(90);
//al.add("Raju");
//al.add("Anjan");
//al.add("Anjan");
System.out.println(al);
System.out.println("------remove()-------");
System.out.println(al.remove((Object)90));
//System.out.println(al.remove(20));

System.out.println("------contains()-------");
System.out.println(al.contains(10));

System.out.println("------size()-------");
System.out.println(al.size());

System.out.println("------set()-------");
System.out.println(al.set(1,"Tanmay"));

System.out.println("------get()-------");
//System.out.println(al.get(12));

System.out.println("------clear()-------");
//al.clear();

System.out.println("------isEmpty()-------");
System.out.println(al.isEmpty());

System.out.println("------getFirst()-------");
System.out.println(al.getFirst());

System.out.println("------getLast()-------");
System.out.println(al.getLast());

System.out.println("------indexOf()-------");
System.out.println(al.indexOf("Khushi"));

ArrayList al1=new ArrayList(2);

ArrayList al2=new ArrayList();
al2.add(10);
al2.add("Tanmay");
al2.add("Anjan");
//al2.add("Lucky");
//al2.add("Anshul");
//al2.add("Nityam");
//al2.add("Khushi");

System.out.println("----addAll-----");
//al2.addAll(al);

System.out.println("----containsAll-----");
System.out.println(al.containsAll(al2));

System.out.println("----removeAll-----");
//System.out.println(al.removeAll(al2));

System.out.println("----retainAll-----");
System.out.println(al.retainAll(al2));

System.out.println();
System.out.println(al);
System.out.println(al2);


	}
}
