package duong;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import huynhkhanhduong.Calculator4;
class TestCalculator4 {

	Calculator4 cal = new Calculator4();
	@Test
	public void test1() {
		cal.setNumber1(10);
		cal.setNumber2(5);
		assertEquals(cal.div(), 2);
	}
	
	@Test
	public void test2() {
		cal.setNumber1(10);
		cal.setNumber2(0);
		assertEquals(cal.div(), 0);
	}
	
	@Test
	public void test3() {
		cal.setNumber1(5);
		cal.setNumber2(2);
		assertEquals(1.0*cal.div(), 2.5);
	}

}
