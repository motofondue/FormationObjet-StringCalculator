import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {
	@Test
	public void shouldBeZeroWhenEmptyStringGiven() {
		// Given
		StringCalculator sc = new StringCalculator();
		// When
		int sum = sc.add("");
		// Then
		assertEquals(0, sum);
	}
	
	@Test
	public void shouldBeOneWhenOneGiven() {
		// Given
		StringCalculator sc = new StringCalculator();
		// When
		int sum = sc.add("1");
		// Then
		assertEquals(1, sum);
	}
	
	@Test
	public void shouldBeThreeWhenOneAndTwoGiven() {
		// Given
		StringCalculator sc = new StringCalculator();
		// When
		int sum = sc.add("1,2");
		// Then
		assertEquals(3, sum);
	}
}
