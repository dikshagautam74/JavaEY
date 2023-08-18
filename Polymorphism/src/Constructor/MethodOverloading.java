//Constructor Overloading

package Constructor;

class M{
	void display(){
		System.out.println("Default constructor");
	}
	void display(int id,String name){
		System.out.println("ID: "+ id);
		System.out.println("Name: "+ name);
	}
	void display(int age,int salary,String designation){
		System.out.println("Age: "+ age);
		System.out.println("salary: "+ salary);
		System.out.println("Designation: "+ designation);
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M a=new M();
		a.display(23,"John");
		a.display(21,400000,"Developer");

	}

}






//same method name + multiple times + different parameters + in same class = Method Overloading
