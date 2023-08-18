package practice;

//4 ques
public class Demo5{
	public static void main(String args[]){		
		String name="John";
		char ch;
		String rev="";
		for(int i=name.length()-1;i>=0;i--){
			ch= name.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);	
	}
}