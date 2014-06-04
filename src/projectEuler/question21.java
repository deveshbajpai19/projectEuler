package projectEuler;


/*Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.

This is the BruteForce Solution.
*/
public class question21 
{
	private boolean isAmicable(int n)
	{	
		boolean isAmicable = false;
		int m = sumOfDivisors(n);
		
		if(m != n && sumOfDivisors(m) == n)
			isAmicable = true;
		
		
		return isAmicable;
	}
	
	private int sumOfDivisors(int num)
	{
		int sum = 0;
		
		for(int i = 1; i < num; i++)
		{
			if(num % i == 0) 
			{
				sum += i;
			}
		}
		
		return sum;
	}
	
	private int driverFunction(int rangeStart, int rangeEnd)
	{
		int sum = 0;
		for(int i = rangeStart; i<= rangeEnd; i++)
		{
			if(isAmicable(i))
			{
				sum += i;
			}
		}
			
		return sum;	
	}
	
	
	public static void main(String[] args) 
	{
		question21 obj = new question21();
		
		int rangeStart = 1, rangeEnd = 100000;
		int sum = obj.driverFunction(rangeStart, rangeEnd);
		
		System.out.println("For range ("+rangeStart+","+rangeEnd+") = "+sum);
	}

}
