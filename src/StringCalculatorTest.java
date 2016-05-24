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
	
	@Test
	public void shouldBeSumWhenUnknownAmountNumbersGiven() {
		// Given
		StringCalculator sc = new StringCalculator();
		// When
		int sum1 = sc.add("9,10,1,2");
		int sum2 = sc.add("1,56,2");
		int sum3 = sc.add("1,4,2,0,-1,5,7,-2");
		int sum4 = sc.add("100,-100");
		int sum5 = sc.add("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20");
		// Then
		assertEquals(22, sum1);
		assertEquals(59, sum2);
		assertEquals(16, sum3);
		assertEquals(0, sum4);
		assertEquals(210, sum5);
	}
}
