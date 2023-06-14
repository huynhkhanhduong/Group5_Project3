package duong;
import huynhkhanhduong.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator1 {
	Calculator1 cal =  new Calculator1();
	@Test
	public void test1() {
		assertEquals(cal.add(1,1), 2);
	}
	
	@Test
	public void test2() {
		assertEquals(cal.add(0,36147), 21147);
	}
	
	@Test
	public void test3() {
		assertEquals(cal.add(0,836418), 4836418);
	}

}
