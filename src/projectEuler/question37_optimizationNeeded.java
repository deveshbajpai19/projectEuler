package projectEuler;

/*The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
*/



public class question37_optimizationNeeded 
{

	public static void main(String[] args) 
	{
		question37_optimizationNeeded obj = new question37_optimizationNeeded();
		
		int primeCount = 0;
		long sum = 0;
		long number = 11;
		do
		{
			boolean result = obj.isTruncatablePrime(number);
			if(result == true)
			{
				primeCount++;
				sum += number;
			}
			
			number++;
		}
		//while(primeCount<=1);
		while(number<=1500000000);
		
		System.out.println("Final sum = "+sum);
		
	}
	
	private boolean isTruncatablePrime(long number)
	{	
		//check left-truncatability for Prime Number
		for(long i = 10; i<=number; i*=10)
		{
			if(isPrime(i)==false)
				return false;
		}
		
		//check right-truncatability for Prime Number
		
		for (; number != 0; number /= 10) 
		{
			if(isPrime(number)==false)
				return false;
		}
		
		
		return true;
		
		
	}
	
	private static boolean isPrime(long number)
	{
		for(int i = 2; i< number; i++)
		{
			if(number%i==0)
				return false;
		}
		
		return true;
	}
	
	
	
}
