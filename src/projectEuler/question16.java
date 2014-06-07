package projectEuler;

import java.math.BigInteger;

/*215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
		Answer is 1366. Here goes its code.
*/
public class question16 
{

	public static void main(String[] args) 
	{
		question16 obj = new question16();
		
		BigInteger num = BigInteger.valueOf(2);
		num = num.pow(1000);
		
		String str_num = num+"";
		
		long str_num_len = str_num.length();
		long str_num_digit_sum = 0;
		
		for(int i =0; i<str_num_len;i++)
		{
			str_num_digit_sum += str_num.charAt(i)-'0'; 
		}
		
		
		System.out.println("Sum of digits = "+str_num_digit_sum);
		

	}

}
