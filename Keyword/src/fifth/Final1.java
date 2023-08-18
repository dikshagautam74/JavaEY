package fifth;

class Emp{
	int id=100;
	String name="John";
	final int salary=5000;
	final void display() {
		
	}
}

final class Clerk extends Emp{   // can inherit
//	void display() {}   can't override
}

final class Dev extends Emp{
	
}

public class Final1 {

	public static void main(String[] args) {
		Clerk c=new Clerk();
		System.out.println(c.id);
		System.out.println(c.name);
		System.out.println(c.salary);
//		c.salary=9000;   can't reassign
//		System.out.println(c.salary);
		System.out.println("=====================");
		
		Dev d=new Dev();
		System.out.println(d.id);
		System.out.println(d.name);
		System.out.println(d.salary);

	}

}
