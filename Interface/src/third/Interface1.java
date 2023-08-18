package third;

interface I{
	public static final int a=10;
	public abstract void add();
	public abstract void sub();
}

interface J{
	public static final int b=20;
	public abstract void div();
	public abstract void mul();
}

interface K extends I,J{
	
}

class Cal implements K{
	public void add() {
		System.out.println("A+B : "+(I.a+J.b));
	}
	public void sub() {
		System.out.println("A-B : "+(I.a-J.b));
	}
	
	public void div() {
		System.out.println("A/B : " + (I.a/J.b));
	}
	public void mul() {
		System.out.println("A*B : "+ (I.a*J.b));
	}
}


public class Interface1 {

	public static void main(String[] args) {
		
		Cal c=new Cal();
		c.add();
		c.sub();
		c.div();
		c.mul();
		
		System.out.println("====== K interface ======");
		K k=c;
		k.add();
		k.sub();
		k.div();
		k.mul();
		
		System.out.println("====== I interface ======");
		I i=c;
		i.add();
		i.sub();
		
		System.out.println("====== J interface ======");
		J j =c;
		j.div();
		j.mul();

	}

}
