package projectEuler;





/*The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1); so the first ten triangle numbers are:1, 3, 6, 10, 15, 21, 28, 36, 45, 55, …

By converting each letter in a word to a number corresponding to its alphabetical position and adding these values we form a word value. For example, the word value for SKY is 19 + 11 + 25 = 55 = t10. If the word value is a triangle number then we shall call the word a triangle word.

*

*

*The method of solution that I follow is using the inverse of the formula of triangle numbers.

*Getting the the t value of the word by adding the sum of each letter in the word,

*the equation t = ½n(n+1) is solved for n as n^2+n - 2t = 0. If the solution got

*is an integer (not a double value), the given word is triangle word.

*

*Here is the code for the same.

*/

public class question42

{

public static void main(String[] args)

{

question42 obj = new question42();

String word = "SKY";

int wordSumWord = obj.wordSumCalculator(word.toLowerCase());

double nValue= obj.n_value(wordSumWord);

if(nValue == (int)nValue)

System.out.println(word+" is a triangle word.");

else

System.out.println(word+" is not a triangle word.");

}

private int wordSumCalculator(String word)

{

int wordSum = 0;

int wordLength = word.length();

for(int i=0; i< wordLength; i++)

{

int letter = word.charAt(i);

wordSum += letter-96;

}

return wordSum;

}

private double n_value(int wordSum)

{

double nValue = (Math.sqrt(1+8*wordSum) - 1.0) *0.5;

return nValue;

}

}

