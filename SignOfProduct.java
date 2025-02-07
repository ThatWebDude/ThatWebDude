package programmingSkills;

public class SignOfProduct {
	
	public int signFunc(int x) {
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        } else {
            return 0;
        }
    }
	
	public int arraySign(int[] nums) {
        int productSign = 1; // Assume positive by default

        for (int num : nums) {
            if (num == 0) {
                return 0; // If there's a zero, the product is zero
            } else if (num < 0) {
                productSign *= -1; // Flip the sign for each negative number
            }
        }

        return productSign;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SignOfProduct solution = new SignOfProduct();
		int[] nums = {-1, -2, -3, -4, 3, 2, 1};
		System.out.println(solution.arraySign(nums));
	}

}
