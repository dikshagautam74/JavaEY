//process of hiding the implementation and only show the functionality to the end user

package third;

abstract class Bank{
	abstract void roi();
	abstract void atm();
}

class sbi{
	void roi() {
		System.out.println("SBI");
	}
	void atm() {
		
	}
}

class axis{
	void roi() {
		System.out.println("Axis");
	}
	void atm() {
		
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		sbi s=new sbi();
		s.roi();
		
		axis a=new axis();
		a.roi();
		

	}

}
