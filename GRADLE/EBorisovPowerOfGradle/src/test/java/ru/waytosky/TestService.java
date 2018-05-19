package ru.waytosky;

import org.junit.*;

public class TestService{
	@Test
	public void testMsg(){
		String str = new Service().getMsg();
		System.out.println("MESSAGE "+str);
		Assert.assertEquals("2 b || ! 2 b",str);
	}
}
