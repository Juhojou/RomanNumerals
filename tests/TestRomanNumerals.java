import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals conventer = new RomanNumerals();

	@Test
	public void test_MakeNewConventer() {
		assertNotNull(null, conventer);
	}
	
	@Test
	public void test_convert_I_to_1() {
		checkEquals(1, "I");
	}
	
	@Test
	public void test_convert_II_to_2() {
		checkEquals(2, "II");
	}
	
	@Test
	public void test_convert_III_to_3() {
		checkEquals(3, "III");
	}
	
	@Test
	public void test_convert_V_to_5() {
		checkEquals(5, "V");
	}
	
	@Test
	public void test_convert_X_to_10() {
		checkEquals(10, "X");
	}
	
	@Test
	public void test_convert_IV_to_4() {
		checkEquals(4, "IV");
	}
	
	@Test
	public void test_convert_VI_to_6() {
		checkEquals(6, "VI");
	}

	private void checkEquals(int number, String romanNumber) {
		assertEquals(number, conventer.convertToInteger(romanNumber));
	}

}
