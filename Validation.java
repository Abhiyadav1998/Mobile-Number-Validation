package collection_practices;

import java.util.Scanner;

public class Validation {
	public static void main(String[] args) {
		System.out.println("Enter mobile number");
		Scanner s= new Scanner(System.in);
			String str=s.next(); 
			String regex="[6-9][0-9]{9}";
			if(str.matches(regex))
			{
	System.out.println("Valid");
	}
			else {
				System.out.println("Invalid");
			}
	}
}
