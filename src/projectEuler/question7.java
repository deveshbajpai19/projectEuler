package projectEuler;
/*
 * 
 * 

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 we can see that the 6th prime is 13.

What is the 10 001st prime number?

 * 
 * */
public class question7 {
	
	public static boolean isPrime(long num)
	{	
		int counter = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				counter++;
		}	
		
		if(counter>2)
			return false;
		else
			return true;
		
		
	}
	
	public static void main(String[] args) 
	{
		long limit = 10001L;
		boolean found = false;
		long num =2;
		long counter = 0;
		
		while(!found)
		{
			if(isPrime(num))
				counter++;
			
			if(counter==limit)
				break;
			
			num++;
		}
		
		System.out.println("Prime number at "+limit+" position is "+num);
		

	}

}
