package first;

class A{
	int y=100;
}
class B extends A{
	int y=200;
	void display(int y){
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(super.y);
	}
}
public class Demo3 {
	public static void main(String[] args) {
		B b =new B();
		b.display(300);
	}
}
