//Constructor Overloading

package Constructor;

class A{
	A(){
		System.out.println("Default constructor");
	}
	A(int id,String name){
		System.out.println("ID: "+ id);
		System.out.println("Name: "+ name);
	}
	A(int age,int salary,String designation){
		System.out.println("Age: "+ age);
		System.out.println("salary: "+ salary);
		System.out.println("Designation: "+ designation);
	}
}


public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		A a2=new A(23,"John");
		A a3=new A(21,400000,"Developer");

	}

}






//same constructor name + multiple times + different parameters + in same class = Constructor Overloading
//Constructor Overriding is not possible because in the child class the constructor should be of the same name but for overloading constructor we have to class A's cosntructor(A),so it will of not the same name of child class(B)