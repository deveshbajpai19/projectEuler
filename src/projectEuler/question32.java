package projectEuler;

import java.util.HashMap;
import java.util.HashSet;


/*
We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; 
for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 × 186 = 7254, 
containing multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity can be written as 
a 1 through 9 pandigital.

HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.
*/
public class question32 
{

	public static void main(String[] args) 
	{
		question32 obj = new question32();
		
		int number = 45213;
		
		System.out.println("Is "+number+" pandigital? "+obj.isPandigital(String.valueOf(number)));
		
		System.out.println("Pandigital products sum = "+obj.productsPandigital());
			
	}
	
	
	private boolean isPandigital(String number) 
	{
		
		//if digits are unique, length of number will be at-most 9
		if(number.length() <= 9)
		{
			// number can contain digits from 1 to 9
			if(number.contains("0") == false)
			{	
				// number should have only unique digits
				if(isDigitsDistinct(number) == true)
				{
					return true;
				}
			}
		}
		
		return false;
	}


	private boolean isDigitsDistinct(String number) 
	{
		char[] digits = number.toCharArray();
		
		HashSet <Character> digitTracker = new HashSet <Character> ();
		
		for(char digitValue : digits)
		{
			if(digitTracker.contains(digitValue))
				return false;
			else
				digitTracker.add(digitValue);
		}
		
		return true;
	}
	
	private long productsPandigital()
	{	
		int product = 0;
		
		HashSet <String> productTracker = new HashSet <String> ();
		
		for(int a = 1; a < 1000; a++)
		{
			for(int b = 1; b < 1000; b++)
			{
				product = a * b;
				
				// checkValue represents concatenated multiplicand, multiplier and product
				String checkValue = String.valueOf(a) + String.valueOf(b) + String.valueOf(product);
				
				if(isPandigital(checkValue))
					productTracker.add(checkValue);
				
			}
		}
		
		long sum = 0;
		
		for(String productValue : productTracker)
		{
			sum += Integer.valueOf(productValue);
		}	
		
		return sum;
	}

}


