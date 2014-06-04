package projectEuler;


/*
 * 
 * Find the sum of all the even-valued terms 
 * in the Fibonacci sequence which do not exceed 4 million.
 * 
 * */

public class question2 
{
	public void func2()
	{
		long a=0, b=1,sum=0 ; //c =0;
		while(true)
		{
			long c = a+b;
			a=b;
			b = c;
			
			if(a>=4000000)
				break;
			
			if(a%2==0)
				sum+=a;
			
		}
		
		System.out.println("Sum required = "+sum);
		
		
	}
	
	
	public static void main(String[] args) 
	{
		question2 obj = new question2();
		
		obj.func2();
		

	}

}
