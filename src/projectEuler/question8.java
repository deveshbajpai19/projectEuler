package projectEuler;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Find the greatest product of five consecutive digits in the 1000-digit number.

public class question8 {

	public static void main(String[] args)  throws Exception
	{
		//read number from text file
		String sourceFile = "/home/dbajpai/workspace2/projectEuler/src/projectEuler/question8text.txt";
		Scanner s = new Scanner(new BufferedReader(new FileReader(sourceFile)));
		
		String num = s.next();
		
		System.out.println(num);
		
		ArrayList <Integer> arr = new ArrayList<Integer>();
		int i = 0;
		int largest = 0;
		
		while((i+4)<num.length())
		{	
			
			System.out.println("----");
			System.out.println(num.charAt(i));
			System.out.println(num.charAt(i+1));
			System.out.println(num.charAt(i+2));
			System.out.println(num.charAt(i+3));
			System.out.println(num.charAt(i+4));
			System.out.println("----");
			
			//we subtract 48 as it characters are converted from
			// ascii to integer
			int digit1 = num.charAt(i)-48;
			int digit2 = num.charAt(i+1)-48;
			int digit3 = num.charAt(i+2)-48;
			int digit4 = num.charAt(i+3)-48;
			int digit5 = num.charAt(i+4)-48;
			
			int prod = 1;
			prod = prod*(digit1)
					*(digit2)
					*(digit3)
					*(digit4)
					*(digit5)
					;
			
			
			if(prod>largest)
			{	
				largest = prod;
				arr.removeAll(arr);
				arr.add(digit1);
				arr.add(digit2);
				arr.add(digit3);
				arr.add(digit4);
				arr.add(digit5);
			}
			
			i+=1;
		}
		
		
		System.out.println("Largest Product of 5  = "+largest);
		System.out.println("By ");
		
		for(int j=0; j<arr.size();j++)
		{
			System.out.print(arr.get(j)+" : ");
		}
		
		
		
		
	}

}
