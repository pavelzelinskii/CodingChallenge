//Create Luhn Algoritm

package core;

public class LuhnAlgoritm {

	public static boolean LuhnNumber(int[] number) {

		int a = 0;

		for (int i = 0; i < number.length; i++) {

			if (number.length % 2 == 0 && i % 2 == 0) {
				a = number[i] * 2;
			}
			if (number.length % 2 == 0 && i % 2 != 0) {
				a = number[i];
			}
			if (number.length % 2 != 0 && i % 2 != 0) {
				a = number[i] * 2;
			}
			if (number.length % 2 != 0 && i % 2 == 0) {
				a = number[i];
			}
			number[i] = a;
		}

		for (int i = 0; i < number.length; i++) {

			if (number[i] > 9) {
				a = number[i] - 9;
			}
			if (number[i] <= 9) {
				a = number[i];
			}
			number[i] = a;
		}

		for (int i = 0; i < number.length; i++) {

			a = a + number[i];
		}

//		for (int i =0; i<number.length;i++ ) System.out.print(number[i]+",");

		if (a % 10 == 0) {
			return true;
		}

		else
			return false;
	}

	public static void main(String[] args) {

		int[] number = { 4, 2, 7, 6, 5, 5, 0, 0, 8, 4, 0, 2, 9, 6, 7, 0 };
		System.out.println("This number is " + LuhnNumber(number));
	}

}
