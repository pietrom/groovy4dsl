package org.amicofragile.groovy4dsl;

import static org.junit.Assert.*;

import org.junit.Test;

public class FooTest {
	@Test
	public void initFoo() throws Exception {
		Foo foo = new Foo();
		assertNotNull(foo);
	}
}
