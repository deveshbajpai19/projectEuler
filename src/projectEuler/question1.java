package projectEuler;

/*
 * Add all the natural numbers below 1000 that are multiples of 3 or 5.
 * 
 * 
 * */
public class question1 
{
	
	public void func1()
	{	
		int sum = 0;
		for(int i=1;i<1000;i++)
		{
			if(i%3==0 || i%5==0)
				sum+=i;
		}
	
		System.out.println("SUm = "+sum);
	}
	
	
	public static void main(String[] args)
	{
		question1 obj = new question1();
	
		obj.func1();
		
	}
}
