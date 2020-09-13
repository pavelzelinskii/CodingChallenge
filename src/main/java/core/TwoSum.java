//Write a function that takes an array of numbers (integers for the tests) 
//and a target number. It should find two different items in the array that, 
//when added together, give the target value. The indices of these items should 
//then be returned in a tuple like so: (index1, index2).
//For the purposes of this kata, some tests may have multiple answers; 
//any valid solutions will be accepted. The input will always be valid 
//(numbers will be an array of length 2 or greater, and all of the items will be 
//numbers; target will always be the sum of two different items from that array).
//
//twoSum [1, 2, 3] 4 === (0, 2)

package core;

public class TwoSum {

	public static int[] twoSum(int[] numbers, int target) {

		int sum = 0;
		int[] numOfIndex = new int[2];

		for (int a = 0; a <= numbers.length - 2; a++) {
			for (int b = numbers.length - 1; b > 0; b--) {
				if (numbers.length <= 2)
					break;
				if (a == b)
					break;
				sum = numbers[a] + numbers[b];
				if (sum == target) {
					numOfIndex[0] = a;
					numOfIndex[1] = b;
				}
			}
		}
		for (int i = 0; i < numOfIndex.length; i++) {
			System.out.print(numOfIndex[i] + " ");
		}

		return numOfIndex;
	}

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 7, 9, 6, 8, 17, 3 };

		int target = 20;

		twoSum(numbers, target);
	}
}

