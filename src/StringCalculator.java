
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
		int total = 0;
		// Loop on numbers count
		for (int i=0; i<nums.length; i++) {
			total += Integer.valueOf(nums[i]);
		}
		
		// Return calculate sum
		return total;
	}
}
