package sixth;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Exception1{

	public static void main(String[] args) {
		m1();
	}
	static void m1(){
		m2();
		System.out.println("M1 class");
	}
	static void m2(){
		m3();
		System.out.println("M2 class");
	}
	static void m3(){
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a value");
			int a=sc.nextInt();
			System.out.println("Enter b value");
			int b =sc.nextInt();
			int res=a/b;
			System.out.println("Res: "+res);
		}
		catch(ArithmeticException ae) {
			System.out.println("Can't divide anything by 0");
			
		}
		catch(InputMismatchException ae) {
			System.out.println("Enter only number");
			
		}
//		it should work,see later
		catch(Exception e) {
			System.out.println(e);
			
		}
		finally
        {
            System.out.println("Thank you ");
        }


	}

}
