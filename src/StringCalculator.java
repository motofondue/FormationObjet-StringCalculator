
public class StringCalculator {

	public int add(String numbers) {
		if (numbers.equals("")) {
			return 0;
		}
		
		String[] nums = numbers.split(",");
		if (nums.length == 1) {
			return Integer.valueOf(nums[0]);
		}
		
		if (nums.length == 2) {
			return Integer.valueOf(nums[0]) + Integer.valueOf(nums[1]);
		}
		
		return -1;
	}
}
