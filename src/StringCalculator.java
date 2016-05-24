
public class StringCalculator {

	private static final String SEPARATOR_STRING = ",";
	private static final String EMPTY_STRING = "";

	// Add numbers in a string with separator
	public int add(String numbers) {
		// Verify empty string
		if (numbers.equals(EMPTY_STRING)) {
			return 0;
		}
		
		// Extract numbers
		String[] nums = numbers.split(SEPARATOR_STRING);
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
