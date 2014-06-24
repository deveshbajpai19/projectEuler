package projectEuler;

import java.util.Scanner;

/*Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

 21 22 23 24 25

 20 7 8 9 10

 19 6 1 2 11

 18 5 4 3 12

 17 16 15 14 13It can be verified that the sum of the numbers on the diagonals is 101.

 What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?

 Answer: 669 171 001

 Here is the code for it. I have made the code slightly dynamic, where-in you can enter the dimension

 of the square diagonal and see the leading & non-leading diagonal elements and thereby see their sum.

 */

public class question25

{

	private int oddSquareDim;

	private int diagonalElemSum;

	private int[] leadDiagonalSum;

	private int[] nonLeadDiagonalSum;

	public question25()

	{

		this.oddSquareDim = 0;

		this.diagonalElemSum = 0;

	}

	public static void main(String[] args)

	{

		question25 obj = new question25();

		Scanner in = new Scanner(System.in);

		// enter the odd dimension for spiral grid

		while (obj.oddSquareDim % 2 != 1)

		{

			System.out.println("Enter odd square dimension");

			obj.oddSquareDim = in.nextInt();

		}

		obj.leadDiagonalSum = obj.calcLeadDiagElements(obj.oddSquareDim);

		obj.nonLeadDiagonalSum = obj.calcNonLeadDiagElements(obj.oddSquareDim);

		System.out.println("\nElements of lead diagonals are:");

		for (int k : obj.leadDiagonalSum)

		{

			System.out.print(k + " ");

			obj.diagonalElemSum += k;

		}

		System.out.println("\nElements of non-lead diagonals are:");

		for (int k : obj.nonLeadDiagonalSum)

		{

			System.out.print(k + " ");

			obj.diagonalElemSum += k;

		}

		// the middle element (intersection point of both diagonal is added
		// twice; subtract its value once from the sum)

		obj.diagonalElemSum -= 1;

		System.out.println("\nSum of diagonal elements is:"
				+ obj.diagonalElemSum);

	}

	private int[] calcNonLeadDiagElements(int oddSquareDim2)

	{

		int[] arr = new int[oddSquareDim];

		int count;

		int value;

		int multiplier;

		int mid = oddSquareDim / 2;

		// set mid element diagonal elements' array

		arr[mid] = 1;

		// generate left half diagonal elements' array

		count = mid - 1;

		multiplier = 4;

		value = 1;

		while (count >= 0)

		{

			value += (multiplier * 2);

			arr[count] = value;

			multiplier += 4;

			count--;

		}

		// generate right half diagonal elements' array

		count = mid + 1;

		multiplier = 2;

		value = 1;

		while (count < oddSquareDim)

		{

			value += (multiplier * 2);

			arr[count] = value;

			multiplier += 4;

			count++;

		}

		return arr;

	}

	private int[] calcLeadDiagElements(int oddSquareDim)

	{

		int[] arr = new int[oddSquareDim];

		int count;

		int value;

		int multiplier;

		int mid = oddSquareDim / 2;

		// set mid element diagonal elements' array

		arr[mid] = 1;

		// generate left half diagonal elements' array

		count = mid - 1;

		multiplier = 3;

		value = 1;

		while (count >= 0)

		{

			value += (multiplier * 2);

			arr[count] = value;

			multiplier += 4;

			count--;

		}

		// generate right half diagonal elements' array

		count = mid + 1;

		multiplier = 1;

		value = 1;

		while (count < oddSquareDim)

		{

			value += (multiplier * 2);

			arr[count] = value;

			multiplier += 4;

			count++;

		}

		return arr;

	}

}
