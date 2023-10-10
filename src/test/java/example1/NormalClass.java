package example1;

import org.testng.annotations.Test;

public class NormalClass {

	@Test
	public void four() {
		System.out.println("four test");
	}

	@Test
	public void Four() {
		System.out.println("Four test");
	}

	@Test
	public void abc() {
		System.out.println("abc test");
	}

}
