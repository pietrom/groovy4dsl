package org.amicofragile.groovy4dsl;

import static org.junit.Assert.*;

import org.junit.Test;

class BarTest {

	@Test
	public void initBar() {
		def bar = new Bar()
		assertNotNull(bar)
	}
}
