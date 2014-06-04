package projectEuler;

//What is the largest prime factor of the number 600851475143 ?


//CHECK SOLUTION

public class question3 
{
	public boolean isPrime(long i)
	{	
		
		for(long j=2;j<=(long)Math.sqrt(i);j++)
		{
			if(i%j==0)
				return false;
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args)
	{	
		question3 obj = new question3();
		
		long num = 600851475143L;
		long i=2;
		while(i<=Math.sqrt(num))
		{	
			//boolean result = obj.isPrime(i);
			//System.out.println(i+" : "+result);			
			//if(result==false || result==true)
			//{
				if(num%i==0)
				{
					num = num/i;
					i--;
				}
				else
					i++;
			//}	
		}
		
		
		System.out.println(num);
		
		
		
		
	}
	
	
}
