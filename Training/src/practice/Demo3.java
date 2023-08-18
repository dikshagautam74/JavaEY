package practice;

//2 ques
public class Demo3{
	public static void main(String args[]){
		int a=0,b=1,c,n=50;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<n-2;i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}	
	}
}
