package projectEuler;

import java.math.BigInteger;

/*
 * FACTORIAL DIGIT SUM
 * 
 * Problem:
n! means n [×] (n [−] 1) [×] ... [×] 3 [×] 2 [×] 1

For example, 10! = 10 [×] 9 [×] ... [×] 3 [×] 2 [×] 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!

*/
public class question20 
{
	private long functionUtil (int number)
	{	
		String fact = factorial(number);
		System.out.println("factorial of number = "+fact);
	
		long digitSum = 0;
		
		for(int i = 0 ; i< fact.length(); i++)
		{
			digitSum += fact.charAt(i) - '0';
		}
		
		return digitSum;
	}
	
	public static String factorial(int n) 
	{
	       BigInteger fact = new BigInteger("1");
	       for (int i = 1; i <= n; i++) {
	           fact = fact.multiply(new BigInteger(i + ""));
	       }
	       return fact.toString();
	   }

	public static void main(String[] args) 
	{
		question20 obj = new question20();
		
		int val = 100;
		long sum = obj.functionUtil(val);
		
		System.out.println("Sum = "+sum);
		

	}

}
