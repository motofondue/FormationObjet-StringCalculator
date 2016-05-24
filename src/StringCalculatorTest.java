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
}
