package com.bayamp.homework.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.bayamp.homework.FibonaciiSeries;

public class FibonacciSeriesTest {
	@Test
	public void myTest() {
		int number=5;
		int[] expectedOutput = {0,1,1,2,3};  ;
		int[] febSeries = FibonaciiSeries.generateFibonacii(number);
		Assert.assertEquals(febSeries, expectedOutput);
	}
}
