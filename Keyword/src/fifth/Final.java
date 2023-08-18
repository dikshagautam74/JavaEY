package fifth;

//final class Car
class Car{
	final int speed=200;
	int model=2020;
	final void gear() {
		System.out.println("Hi I have 5 gears");
	}
}

class BMW extends Car{
	
//	void gear() {    final method can't be overridden
//		System.out.println("Hi I have 8 gears"); 
//	}
}
public class Final {
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println("Speed: "+c.speed);
//		c.speed=2000;  we can't reassign value
		
		BMW b=new BMW();
		b.gear();
//		System.out.println("Model: "+b.model);  can't inherit this if car made to final class
		
		
		

	}

}
