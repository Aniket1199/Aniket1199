package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CodeTest {


	@Test
	void test1() {
		int res=new TestClass3().divide(10, 5);
	}
	@Test
	void test2() {
		int res=new TestClass3().divide(2, -2);
	}
	@Test
	void test3() {
		TestClass3 c=new TestClass3();
		try {
			int a=c.divide(2, 0);
			assertEquals(-1, a);}
		
		catch (Exception e) {
			fail();
		}
			
		}
	}


