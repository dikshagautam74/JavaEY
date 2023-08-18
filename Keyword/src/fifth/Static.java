package fifth;

//with static keyword,there is no need to create an object

class A{
	static int x=100;
	static void display() {
		System.out.println("Hiiiiii");
	}
}
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.display();
		System.out.println(A.x);		

	}

}
