package practice;

//7 ques
public class Demo8{
	public static void main(String args[]){
		int a[]={1,6,2,3,4,5,2,1,3};
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println(a[i]);
				}			
			}
		}
	}

}
