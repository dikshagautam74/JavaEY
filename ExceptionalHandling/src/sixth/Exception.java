package sixth;
import java.util.*;


public class Exception {
	public static void main(String[] args) {
		Exception.m1();
	}
	static void m1() {
		Exception.m2();
		System.out.println("M1 class");
	}
	static void m2() {
		Exception.m3();
		System.out.println("M2 class");
	}
	static void m3() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a value:");
			int a=sc.nextInt();
			System.out.println("Enter b value:");
			int b=sc.nextInt();
			
			int res=a+b;
			System.out.println("Result:"+res);
		}
		catch(InputMismatchException im) {
			System.out.println("Please enter number only...");
		}
	}

}
