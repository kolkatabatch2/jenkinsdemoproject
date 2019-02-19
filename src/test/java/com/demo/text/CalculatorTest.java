package com.demo.text;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.Calculator;

public class CalculatorTest {

	@Test
	public void test() {
	   Calculator calc=new Calculator();
	   assertEquals(10,calc.add(6,4));
	}

}
