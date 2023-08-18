package third;

interface P{
	int a=100;
	public abstract void aaa();
	public abstract void bbb();
}
interface Q{
	
}
interface R extends P,Q{
	
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			P p = new P();  not possible to create object of interface
	}

}
