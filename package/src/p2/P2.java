package p2;
import p1.A;

public class D extends A{
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	
	}
}

class E{
	A a1=new A();
	void display() {
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);
	
	}
}

class F extends D{
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	
	}
}
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
