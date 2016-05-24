import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {
	@Test
	public void emptyStringToZero() {
		// Given
		StringCalculator sc = new StringCalculator();
		// When
		int sum = sc.add("");
		// Then
		assertEquals(0, sum);
	}
	
	@Test
	public void stringWithOneNumber() {
		// Given
		StringCalculator sc = new StringCalculator();
		// When
		int sum = sc.add("1");
		// Then
		assertEquals(1, sum);
	}
	
	@Test
	public void stringWithTwoNumbers() {
		// Given
		StringCalculator sc = new StringCalculator();
		// When
		int sum = sc.add("1,2");
		// Then
		assertEquals(3, sum);
	}
}
