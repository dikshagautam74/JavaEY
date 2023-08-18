package third;

abstract class Banker{
	Banker(){}
	abstract void roi();
	abstract void loan();
	void withdraw() {}
}

//can have abstract method or non abstract in abstract class
abstract class Abc extends Banker{
	void roi() {
		System.out.println("ROI");
	}
	void loan() {
		System.out.println("LOAN");
	}
	abstract void onlineTransfer();
}

// can't have abstract method in simple class
class Xyz extends Abc{
	void onlineTransfer() {
		System.out.println("Online Transfer");
	}
}
public class Abstract1 {

	public static void main(String[] args) {
//		Banker b=new Banker();   we can't create object of abstract class
//		Abc a =new Abc();
		Xyz x=new Xyz();
		x.roi();
		x.loan();
		x.onlineTransfer();

	}

}
