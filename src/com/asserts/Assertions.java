package com.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	@Test
	public void NumberAccuracy() {
		int r = 10 * 2;
		
		Assert.assertEquals(r, 20);
			
	}
	
	@Test
	public void NumberAccuracy2() {
		int r = 10 *2;
		
		Assert.assertFalse(r != 20);
	}
	
	@Test
	public void NumberAccuracy3() {
		int r = 10 * 2;
		
		Assert.assertTrue(r == 20);
	}
}
