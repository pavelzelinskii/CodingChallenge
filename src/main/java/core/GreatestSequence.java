
//In the following 6 digit number: 283910
//91 is the greatest sequence of 2 consecutive digits.
//In the following 10 digit number: 1234567890
//67890 is the greatest sequence of 5 consecutive digits.
//Complete the solution so that it returns the greatest 
//sequence of five consecutive digits found within the number given. 
//The number will be passed in as a string of only digits. 
//It should return a five digit integer. The number passed may be as 
//large as 1000 digits.

package core;

public class GreatestSequence {

	public static int FiveDigits(String number) {
		int sumCurent = 0;
		int sumLarge = 0;
		int sumOfNumbers = 0;
		String sumNumbers = "";

		for (int i = 0; i < number.length() - 4; i++) {

			sumCurent = SumCurrent(sumOfNumbers, sumLarge);
			sumNumbers = (String) number.subSequence(i, i + 5);
			sumOfNumbers = Integer.parseInt(sumNumbers);
			sumLarge = SumLarge(sumCurent, sumOfNumbers);

		}
		return sumLarge;
	}

	public static int SumCurrent(int sumOfNumbers, int sumLarge) {
		if (sumOfNumbers > sumLarge) {
			return sumOfNumbers;
		} else
			return sumLarge;
	}

	public static int SumLarge(int sumCurent, int sumOfNumbers) {
		if (sumCurent > sumOfNumbers) {
			return sumCurent;
		} else
			return sumOfNumbers;
	}

	public static void main(String[] args) {

		String number = "123456908987976786786";
		System.out.println("The large number is: " + FiveDigits(number));
	}

}
