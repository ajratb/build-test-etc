package ru.wts;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	@Test
	public void shouldReturnTrue() {
		boolean initVal = false;
		Demo demo = new Demo(initVal);
		assertEquals(initVal, demo.getBool());
	}

}
