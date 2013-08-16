package org.amicofragile.groovy4dsl.inheritance;

import static org.junit.Assert.*;

import org.junit.Test;

class BasicGreetingsSourceTest {
	@Test
	def void sayHelloToDefaultTarget() {
		GreetingsSource source = new BasicGreetingsSource();
		assertEquals("Hello, World!", source.sayHello())
	}
	
	@Test
	def void sayHelloToCustomTarget() {
		GreetingsSource source = new BasicGreetingsSource();
		assertEquals("Hello, Peter!", source.sayHelloTo("Peter"))
	}

}
