package programmingSkills;

import java.util.Scanner;

public class PlusOneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum = 0;
		int [] digits = new int[5];
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter integer array: ");
		
		for (int i = 0; i < digits.length; i++) {
			if(scnr.hasNextInt()) {
				userNum = scnr.nextInt();
				digits[i] = userNum;
			}
		}
		
		scnr.close();
		
		// need to create a result array to hold the possibility of a new array being
		// created from carrying.
		
		int[] result = plusOne(digits);
				
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
		
				
	}

	private static int[] plusOne(int[] num) {

		int n = num.length;
		// parsing the array from the right to left and testing to see if the last
		// element is a 9.  if it is, then we need to do something about the extra 1
		for(int i = n - 1; i >= 0; i--) {
			if (num[i] < 9) {
				num[i]++;		// if it's not a 9, then a 1 is added to it.
				return num;
			}
			// if the element is a 9, then it is made into a zero
			num[i] = 0;
		}
		// if the first element is a 9 and needs to be incremented, then a new array
		// is created with the first element made to equal 1.
		int[] newDigits = new int[n + 1];
		newDigits[0] = 1;
		
		return newDigits;		
	}

	
}
