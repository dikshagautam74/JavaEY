package practice;

//8 ques
public class Demo6{
	public static void main(String args[]){
		int a[]={6,2,3,40,8,5};
		int k=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>k){
				k=a[i];
			}
			else{
				continue;
			}
		}
		System.out.println(k);
	}
}