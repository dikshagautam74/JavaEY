package Validation;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a 10-digit mobile number: ");
        String phoneNumber = sc.nextLine();
        int sum = 0;
        char firstDigit=phoneNumber.charAt(0);
        if(phoneNumber.length()==10 && firstDigit =='9'||firstDigit=='8'|| firstDigit =='7') {
        	System.out.print("Valid");
        }
        else {
        	System.out.print("Invalid");
        }
        for(int i=0;i<phoneNumber.length();i++) {
        	sum+=phoneNumber.charAt(i);
        }
        if(sum==40) {
        	System.out.print("Lucky");
        }
	}

}
