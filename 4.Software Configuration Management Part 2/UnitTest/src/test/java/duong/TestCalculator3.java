package duong;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import huynhkhanhduong.Calculator3;
class TestCalculator3 {

	@Test
	public void test1() {
		Calculator3 cal =  new Calculator3(10, 3);
		assertEquals(cal.mul(), 30);
	}
	
	@Test
	public void test2() {
		Calculator3 cal =  new Calculator3(999999, 3);
		assertEquals(cal.mul(), 1);
	}
	
	@Test
	public void test3() {
		Calculator3 cal =  new Calculator3(1000000, -1000000);
		assertEquals(cal.mul(), 30);
	}

}
