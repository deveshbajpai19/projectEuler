package projectEuler;

/*
 * If the numbers 1 to 5 are written out in words: 
 * one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
how many letters would be used? Answer is 21124. Here goes the code. 
*/


public class question17 
{
	public String[] ONES = {"zero", 
							"one", 
							"two", 
							"three", 
							"four", 
							"five", 
							"six", 
							"seven", 
							"eight", 
							"nine"
							};  
	
	public String[] TEENS = {"ten", 
							 "eleven", 
							 "twelve", 
							 "thirteen", 
							 "fourteen", 
							 "fifteen", 
							 "sixteen", 
							 "seventeen", 
							 "eighteen", 
							 "nineteen"};
	
	public String[] TENS = {"twenty", 
							"thirty", 
							"forty", 
							"fifty", 
							"sixty", 
							"seventy", 
							"eighty", 
							"ninety"};
	
	
	
	public static void main(String[] args) 
	{	
		
		question17 obj = new question17();
		
		
		int count = 0;
		for(int number =1 ; number <=1000; number++)
		{
			String numberInWords = "";
			if(number < 100)
			{
				numberInWords = obj.tens(number);
			}
			else if(number >= 100 && number <= 999) 
			{
				numberInWords = obj.hundreds(number);
			}
			else if (number == 1000)
			{
				numberInWords = "OneThousand";
			}
			
			
			
			
			//System.out.println(numberInWords);
			//System.out.println(numberInWords.length());
			count += numberInWords.length();
		}
		
		System.out.println("Final Answer = "+count);
		
	}
	
	
	private String hundreds(int number) 
	{
		
		String hundredName = "";
		if (number / 100 % 10 != 0)
			hundredName += ONES[number / 100 % 10] + "hundred";
		    
		return (hundredName + (number % 100 != 0 ? "and" + tens(number % 100) : ""));
		
		
	}


	private String tens(int number)
	{	
		if(number < 10)
		{
			return ONES[number];
		}
		else if(number < 20)
		{
			return TEENS[number - 10];
		}
		else
		{
			return TENS[number / 10 - 2] + (number % 10 != 0 ? ONES[number % 10] : "");
		}
		
	}
	
}
