package projectEuler;

/*
 * 
 * 

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

Clue: It is similar to find LCM for a series


 * 
 * 
 * */


public class question5 
{
	public int divisble_to(int i)
	{	
		if(i==1)
			return 1;
		else
		{
			int step = divisble_to(i-1);
			int num = 0;
			boolean found = false;
			
			while(!found)
			{	
				
				num+= step;
				
				if(num%i!=0)
					found = false;
				else
					found = true;
			}
			
			return num;
		}
		
		
	}
	
	
	public static void main(String[] args) 
	{
		
		question5 obj = new question5();
		System.out.println(obj.divisble_to(3));

	}

}
