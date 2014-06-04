package projectEuler;

/*
 * 
 * 

The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the 
first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

 * 
 * */

public class question6 
{
	
	public void func(int range)
	{	
		
		int sum1 = (int)Math.pow((range*(range+1))/2, 2);
		
		int sum2 = (range*(range+1)*(2*range+1))/6;
		
		
		System.out.println(Math.abs(sum1-sum2));
		
	}
	
	
	public static void main(String[] args) 
	{
		question6 obj = new question6();
		obj.func(10);
		//use: sum of AP = N(N+1) /2 
		//use: sum of squares = N(N+1)(2N+1) /6;
		

	}

}
