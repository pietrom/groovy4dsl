package org.amicofragile.groovy4dsl.currying;

import static org.junit.Assert.*;

import org.junit.Test;

class CurryingTest {
	def base = {
			x, y, z ->
			"(${x}, ${y}) : ${z}"
	}
	
	@Test
	def void testBase() {
		assertEquals("(A, B) : 10", base("A", "B", 10) as String)
	}
	
	@Test
	def void testCurryingSingleParameter() {
		def singleCurryied = base.curry("AA")
		assertEquals("(AA, B) : 10", singleCurryied("B", 10) as String)
	}
	
	@Test
	def void testCurryingMultipleParameters() {
		def multiCurryied = base.curry("AA", "BB")
		assertEquals("(AA, BB) : 10", multiCurryied(10) as String)
	}
	
	@Test
	def void testCurryingInMultipleSteps() {
		def firstStep = base.curry("XX");
		def secondStep = firstStep.curry("YY", 11);
		assertEquals("(XX, YY) : 11", secondStep() as String)
	}
}
