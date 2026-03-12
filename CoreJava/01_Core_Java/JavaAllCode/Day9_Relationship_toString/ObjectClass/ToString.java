package Day9_Relationship.ObjectClass;

public class ToString 
{
	int roll;
	String name;
	int age;
	static String college="LPU";
	
	public ToString(int roll,String name,int age,String college) {
this.roll=roll;
this.name=name;
this.age=age;
//this.college=college;
	college="DPS";
	}
	
	
	
//	 void display() {
//		System.out.println("Roll	= "+roll);
//		System.out.println("Name	= "+name);
//		System.out.println("Age	= "+age);
//		System.out.println("Colege	= "+college);
//		System.out.println("----=====++++=====-----");
//
//	}
	 @Override
	 public String toString() {
	        return "Roll	= "+roll+"\nName	= "+name+"\nAge	= "+age+"\nCollege	= "+college+"\n----=====++++=====-----";
	    }
	 public int hashCode()
	 {
		 return roll+name.hashCode()+age+college.hashCode();
	 }
	 public boolean equals(Object obj) {
		 ToString s=(ToString)obj;
		 
	        return (this.roll == s.roll && this.name==s.name && this.age==s.age
	        		&& this.college==s.college);
	 }

	public static void main(String[] args) {
		college="DPS";
		
	ToString t=new ToString(1,"Tanmay", 20, "L");
	ToString t1=new ToString(2,"Anjan", 21, "LPU");
	ToString t2=new ToString(3,"Lucky", 23, "LPU");
	ToString t3=new ToString(4,"Anshul", 18, "LPU");
	ToString t4=new ToString(5,"Srinivas", 14, "LPU");
	ToString t5=new ToString(1,"Tanmay", 20, "LPU");
	
	System.out.println(t.equals(t5));
//	t.display();
//	t1.display();
//	t2.display();
//	t3.display();
//	t4.display();
//	t5.display();
	
//	System.out.println(t.toString());
//	System.out.println(t1);
//	System.out.println(t2);
//	System.out.println(t3);
//	System.out.println(t4);
//	System.out.println(t5);
	
//	System.out.println(t.hashCode());
//	System.out.println(t1.hashCode());
//	System.out.println(t2.hashCode());
//	System.out.println(t3.hashCode());
//	System.out.println(t4.hashCode());
//	System.out.println(t5.hashCode());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	System.out.println("Roll	= "+t.roll);
//	System.out.println("Name	= "+t.name);
//	System.out.println("Age	= "+t.age);
//	System.out.println("Colege	= "+t.college);
//	System.out.println("----=====++++=====-----");
//	System.out.println("Roll	= "+t1.roll);
//	System.out.println("Name	= "+t1.name);
//	System.out.println("Age	= "+t1.age);
//	System.out.println("Colege	= "+t1.college);

	}
}