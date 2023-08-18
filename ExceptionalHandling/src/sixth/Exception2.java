package sixth;

import java.io.*;

class A{
	
	void display() throws FileNotFoundException,IOException,NumberFormatException,MaxAgeException {
		for(int i=0;i<=20;i++) {
			if(i==18) throw new NumberFormatException();
			if(i==16) throw new NullPointerException();
			if(i==13) throw new ArrayIndexOutOfBoundsException();
			
			if(i==15) throw new FileNotFoundException();
			if(i==12) throw new IOException();
			
			if(i==10) throw new MaxAgeException("max age is only 60");
			
			System.out.println("I: "+i);
		}
	}
}

public class Exception2 {
	public static void main(String[] args) {
		try {
			A a = new A();
			a.display();
		}
		
		catch(NumberFormatException nf) {
			System.out.println("Number Format Exception came");
		}
		
		catch(FileNotFoundException fnf) {
			System.out.println("File Not Found Exception came");
		}
		
		catch(NullPointerException np) {
			System.out.println("Null Pointer Exception came");
		}
		
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Array Index Out Of Bounds Exception came");
		}
		
		catch(IOException io) {
			System.out.println("IO Exception came");
		}
		
		catch(MaxAgeException ma) {
			System.out.println(ma);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}	
		finally {
			System.out.println("Thank You....!");
		}
	}
}

class MaxAgeException extends Exception 
{
	MaxAgeException()
	{
	}
	MaxAgeException(String str)
	{
		super(str);
	}
}