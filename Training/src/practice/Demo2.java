package practice;

//1 question
public class Demo2{
	public static void main(String args[]){
		int a=2,b=3,c;
		System.out.println("Before swapping");
		System.out.println("a:"+ a +" b:" + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping");
		System.out.println("a:"+ a +" b:" + b);
	}
}
