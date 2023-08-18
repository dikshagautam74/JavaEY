package practice;

//to check even numbers from 1 to 50
class A{
	void print(){
		int n=60;
		if(n%2==0){
			System.out.println("Even number");
		}
		else{
			System.out.println("Odd number");	
		}
	}
	void printevenNumber(){
		for(int i=0;i<=50;i++){
			if(i%2==0){
				System.out.println("I:"+i);
			}
		}	
	}	
}

//palindrome
class B{
	void reverse(){
		String name="John";
		char ch;
		String rev="";
		for(int i=name.length()-1;i>=0;i--){
			ch= name.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		for(int j=0;j<name.length();j++){
 			if(name.charAt(j)==rev.charAt(j)){
				System.out.println("It is a palindrome");
				break;
			}
			else{
				System.out.println("Not a palindrome");
				break;
		}
		}
		
	}
}

public class Demo1{
	public static void main(String args[]){
		A a = new A();
		B b = new B();
		a.print();
		System.out.println();
		a.printevenNumber();
		System.out.println();
		b.reverse();		

	}
}