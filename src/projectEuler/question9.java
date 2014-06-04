package projectEuler;

/*
A Pythagorean triplet is a set of three natural numbers, 
a < b < c, for which, a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc
*
*
*
*
*Solution:
*c = 1000-(a+b) starting with the second, rearrange for c

a2 + b2 = (1000-(a+b))2 insert c into Pythagoras' equation

a2 + b2 = 1000000 - 2000*(a+b) + (a+b)2 multiply out RHS

a2 + b2 = 1000000 - 2000*(a+b) + a2 + 2*a*b + b2 multiply out RHS again

0 = 1000000 - 2000*(a+b) + 2*a*b remove a2 + b2 from both sides

2000*(a+b) - 2*a*b = 1000000 rearrange to put all the a's on the LHS

1000*(a+b) - a*b = 500000 divide everything by 2 to simplify

a(1000-b) + 1000*b = 500000 factor all the a terms together

a(1000-b) = 500000 - 1000*b rearrange to put only the a's on the LHS

a = (500000-1000*b) / (1000-b) divide though to get an equation for a in therms of b that satisfies original equations

Now all we have to do is try lots of b up to 1000, and find a case where a is an integer, we assume there is only one
*
*
*
*/
public class question9 
{

	public static void main(String[] args) 
	{
	
		
		
		double a = 0, b = 0,c=0;
		for(b=1;b<=1000;b++)
		{
			a = (500000 - 1000*b) / (1000 - b);
			
			
			//to check if a is an integer
			if(a == Math.ceil(a) && a == Math.floor(a))
			{
				c = 1000 - a -b;
				break;
			}
			
		}
		
		System.out.println(a+", "+b+", "+c);
		System.out.println("abc = "+(a*b*c));
		
		
	}

}
