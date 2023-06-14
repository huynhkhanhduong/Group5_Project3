package duong;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import huynhkhanhduong.Calculator2;
class TestCalculator2 {
	Calculator2 cal =  new Calculator2();
	@Test
	public void test1() {
		cal.number1 = 1;
		cal.number2 = 3;
		cal.sub();
		assertEquals(cal.result, -2);
	}
	
	@Test
	public void test2() {
		cal.number1 = 10000;
		cal.number2 = 0;
		cal.sub();
		assertEquals(cal.result, 100000);
	}
	
	@Test
	public void test3() {
		cal.number1 = -100000;
		cal.number2 = 0;
		cal.sub();
		assertEquals(cal.result, 10000);
	}

}
