//part 1
package Constructor;

class P{
	void abc() {
		System.out.println("P class abc method");
	}
}

class Q{
	void abc() {
		System.out.println("Q class abc method");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Q q=new Q();
		q.abc();
	}
}

//Part 2
class Bank{
	void abc() {
		System.out.println("Simple method");
	}
}

class SBI extends Bank{
	void abc() {
		System.out.println("SBI method");
	}
}
class Axis extends Bank{
	void abc() {
		System.out.println("Axis method");
	}
}

class ICICI extends Bank{
	void abc() {
		System.out.println("ICICI method");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		ICICI q=new ICICI();
		q.abc();
		
		SBI s=new SBI();
		s.abc();
		
		Axis a=new Axis();
		a.abc();
	}
}
