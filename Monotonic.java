package programmingSkills;

public class Monotonic {
	
	public boolean isMonotonic(int[] nums) {
		
		boolean isIncreasing = true;
		boolean isDecreasing = true;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				isDecreasing = false;
			}
			if (nums[i] < nums[i - 1]) {
				isIncreasing = false;
			}
		}
		
		return isIncreasing || isDecreasing;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monotonic solution = new Monotonic();
		int [] nums = {1,2,2,3};
		int [] nums1 = {6,5,4,4};
		int [] nums2 = {1,3,2};
		
		System.out.println(solution.isMonotonic(nums));
		System.out.println(solution.isMonotonic(nums1));
		System.out.println(solution.isMonotonic(nums2));
	}

}
