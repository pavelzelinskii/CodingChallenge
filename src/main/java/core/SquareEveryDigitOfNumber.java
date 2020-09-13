//Welcome. In this kata, you are asked to square every digit of a number.
//For example, if we run 9119 through the function, 811181 will come out, 
//because 9*9 is 81 and 1*1 is 1.
//Note: The function accepts an integer and returns an integer

package core;

public class SquareEveryDigitOfNumber {

	public static int SqEvDig(int number1) {

		String str = String.valueOf(number1);
		String str1 = "";
		int number2 = 0;
		int number3 = 0;
		int digit = 0;
		for (int i = 0; i < str.length(); i++) {
			number2 = Character.getNumericValue(str.charAt(i));
			number3 = number2 * number2;
			str1 = str1 + String.valueOf(number3);
			digit = Integer.parseInt(str1);
		}

		return digit;
	}

	public static void main(String[] args) {
		int number1 = 81187;

		System.out.println(SqEvDig(number1));
	}

}
