
public class StringCalculator {

	// Add numbers in a string with , as separator
	public int add(String numbers) {
		// Verify empty string
		if (numbers.equals("")) {
			return 0;
		}
		
		// Extract numbers
		String[] nums = numbers.split(",");
		// Return the number if it's unique
		if (nums.length == 1) {
			return Integer.valueOf(nums[0]);
		}
		
		// Return sum if two numbers are given
		if (nums.length == 2) {
			return Integer.valueOf(nums[0]) + Integer.valueOf(nums[1]);
		}
		
		// Default return
		return -1;
	}
}
