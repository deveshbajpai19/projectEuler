package projectEuler;

import java.util.ArrayList;
import java.util.TreeMap;

/*
 * 
 * 

A palindromic number reads the same both ways.
 The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

 * 
 * 
 * 
 * */

public class question4 
{
	
	@SuppressWarnings("unused")
	private boolean isPalin(int num)
	{	
		String numFrontBack = Integer.toString(num);
		String numBackFront = new StringBuilder(numFrontBack).reverse().toString();
		
		if(numBackFront.equalsIgnoreCase(numFrontBack))
			return true;
		else
			return false;
	}
	
	public void find()
	{	
		ArrayList<Integer> palindrome = new ArrayList<Integer>();
		
		for(int i =999;i>=100;i--)
		{	
			
			for(int j=999;j>=100;j--)
			{	
				int prod = i*j;
				if(isPalin(prod))
				{
					palindrome.add(prod);
					
				}
				
			}
			
		}
		
		int largestPalin = palindrome.get(0);
		for(int k = 1; k< palindrome.size();k++)
		{
			if(palindrome.get(k)>largestPalin)
				largestPalin = palindrome.get(k);
		}
		
		System.out.println(largestPalin);
		
	}
	
	
	public static void main(String[] args) {
		
		question4 obj = new question4();
		obj.find();

	}

}
