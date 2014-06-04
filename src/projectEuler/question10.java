package projectEuler;
/*
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 * 
 */
public class question10 {
	
	
	public static boolean isPrime(double num)
	{	
		
		for(int j=2;j<=Math.sqrt(num);j++)
		{
			if(num%j==0)
				return false;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) 
	{	
		double limit = 2000000, sum = 0;
		for(double i=2;i<limit;i++)
		{
			if(isPrime(i))
			{
				//System.out.println(i+" is Prime "+isPrime(i));
				sum+=i;
			}
		}
		
		
		System.out.println("Sum of prime numbers below "+limit+" is = "+sum);
	}

}
