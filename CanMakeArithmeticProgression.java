package programmingSkills;

import java.util.Arrays;

public class CanMakeArithmeticProgression {
	
	public boolean ArithmeticProgression(int[] arr) {
		
		Arrays.sort(arr); // sort the array
		
		int diff = arr[1] - arr[0]; // finding the common difference
		
		for (int i = 2; i < arr.length; i++) { // check if all consecutive elements have the same difference
			if (arr[i] - arr[i - 1] != diff) {
				return false;			// not an arithmetic progression
			}
		}
		
		return true;		// It's an arithmetic progression
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CanMakeArithmeticProgression solution = new CanMakeArithmeticProgression();
		int [] nums = {3, 5, 1};
		int [] nums2 = {1, 2, 4};
		
		System.out.println(solution.ArithmeticProgression(nums));
		System.out.println(solution.ArithmeticProgression(nums2));
	}

}
