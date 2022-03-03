package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyProgramTest {

	@Test
	void testFirstSum1() {
		Myprogram prog=new Myprogram();
		int actual=prog.findSum(10,5);
		assertEquals(15, actual);
	}
	@Test
	void testFirstSum2() {
		Myprogram prog=new Myprogram();
		int actual=prog.findSum(-5,5);
		assertEquals(0, actual);

}
}