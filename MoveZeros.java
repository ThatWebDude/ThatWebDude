package programmingSkills;

import java.util.Scanner;

public class MoveZeros {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		System.out.print("Please enter an array of integers: ");
		
		for(int i = 0; i < nums.length; i++) {
			if (scnr.hasNextInt()) {
				nums[i] = scnr.nextInt();
			}
		}
		System.out.println(nums);
		scnr.close();
		
		moveZeros(nums);		
		
		System.out.println("Sorted array: " + nums);
				
	}

	public static void moveZeros(int[] nums) {
		int nonZeroPos = 0;	// Pointer for the next non-zero element position
		
		// iterate through the array
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				// Swap the current element with the element at nonZeroPos
				int temp = nums[nonZeroPos];
				nums[nonZeroPos] = nums[i];
				nums[i]= temp;
				
				// move the non-zero pointer forward
				nonZeroPos++;
			}
		}
		
	}
}
