package practice;

//taking input from user
import java.util.Scanner;
//class A{
//	int id,age,salary;
//	String name,designation;
//	A(){
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter ID :");
//		id=sc.nextInt();
//		
//		System.out.println("Enter age :");
//		age=sc.nextInt();
//
//		System.out.println("Enter salary:");
//		salary = sc.nextInt();
//
//		System.out.println("Enter Name :");
//		name=sc.next();
//
//		System.out.println("Enter Designation:");
//		designation = sc.next();
//
//	}
//	void display(){
//		System.out.println("My ID is :"+id);
//		System.out.println("My Name :"+ name);
//		System.out.println("My Age is :"+age);
//		System.out.println("My Salary is :"+ salary);
//		System.out.println("My Designation:"+ designation);
//	}
//}
class clerk1{
	int id,age,salary;
	String name,designation;
	clerk1(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID :");
		id=sc.nextInt();
		
		System.out.println("Enter age :");
		age=sc.nextInt();

		System.out.println("Enter salary:");
		salary = sc.nextInt();

		System.out.println("Enter Name :");
		name=sc.next();

		System.out.println("Enter Designation:");
		designation = sc.next();

	}
	void display(){
		System.out.println("My ID is :"+id);
		System.out.println("My Name :"+ name);
		System.out.println("My Age is :"+age);
		System.out.println("My Salary is :"+ salary);
		System.out.println("My Designation:"+ designation);
	}
}
class dev{
	int id,age,salary;
	String name,designation;
	dev(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID :");
		id=sc.nextInt();
		
		System.out.println("Enter age :");
		age=sc.nextInt();

		System.out.println("Enter salary:");
		salary = sc.nextInt();

		System.out.println("Enter Name :");
		name=sc.next();

		System.out.println("Enter Designation:");
		designation = sc.next();

	}
	void display(){
		System.out.println("My ID is :"+id);
		System.out.println("My Name :"+ name);
		System.out.println("My Age is :"+age);
		System.out.println("My Salary is :"+ salary);
		System.out.println("My Designation:"+ designation);
	}
}
class tester1{
	int id,age,salary;
	String name,designation;
	tester1(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID :");
		id=sc.nextInt();
		
		System.out.println("Enter age :");
		age=sc.nextInt();

		System.out.println("Enter salary:");
		salary = sc.nextInt();

		System.out.println("Enter Name :");
		name=sc.next();

		System.out.println("Enter Designation:");
		designation = sc.next();

	}
	void display(){
		System.out.println("My ID is :"+id);
		System.out.println("My Name :"+ name);
		System.out.println("My Age is :"+age);
		System.out.println("My Salary is :"+ salary);
		System.out.println("My Designation:"+ designation);
	}
}
class manager1{
	int id,age,salary;
	String name,designation;
	manager1(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID :");
		id=sc.nextInt();
		
		System.out.println("Enter age :");
		age=sc.nextInt();

		System.out.println("Enter salary:");
		salary = sc.nextInt();

		System.out.println("Enter Name :");
		name=sc.next();

		System.out.println("Enter Designation:");
		designation = sc.next();

	}
	void display(){
		System.out.println("My ID is :"+id);
		System.out.println("My Name :"+ name);
		System.out.println("My Age is :"+age);
		System.out.println("My Salary is :"+ salary);
		System.out.println("My Designation:"+ designation);
	}
}
class Demo11{
	public static void main(String args[]){
//		A a= new A();
//		a.display();

		clerk1 c= new clerk1();
		c.display();
		
		dev d= new dev();
		d.display();

		tester1 t= new tester1();
		t.display();

		manager1 m= new manager1();
		m.display();
	}
}