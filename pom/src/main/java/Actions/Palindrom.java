package Actions;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) 
		{
		      String inputString, outputString = "";
		      Scanner sc = new Scanner(System.in);
		 
		      System.out.println("Enter a string:");
		      inputString = sc.nextLine();

		      int length = inputString.length();
		 
		      for ( int i = length - 1; i >= 0; i-- )
		         outputString = outputString + inputString.charAt(i);
		 
		      if (inputString.equals(outputString))
		         System.out.println(inputString+" is a palindrome");
		      else
		         System.out.println(inputString+" is not a palindrome");
		 
		      sc.close();
		   }
		}


