package practice;

//14 question
public class Demo10{
	public static void main(String args[]){
		String name="Hello World";
		int count=0;
		for(int i = 0; i < name.length(); i++){    
            		if(name.charAt(i) != ' ')    
                		count++;    
        	}                
        	System.out.println("Total number of characters in the string: " + count);
	}
}
