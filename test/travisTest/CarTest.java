package travisTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	Car car;
	
	@Before
	public void init(){
		car = new Car("わ 123-456");
	}
	@Test
	public void testGetNo_S001() {
		assertEquals(car.getNo(),"わ 123-456");	
	}
	@Test
	public void testGetNo_S002() {
		//assertEquals(car.getNo(),"error no");	
	}
}
