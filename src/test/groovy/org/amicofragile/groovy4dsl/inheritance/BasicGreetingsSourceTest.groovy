package org.amicofragile.groovy4dsl.inheritance;

import static org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class BasicGreetingsSourceTest {
	private GreetingsSource source;

	@Before
	def void initGreetingsSource() {
		source = new BasicGreetingsSource(greetings: "Hello");
	}
	
	@Test
	def void sayHelloToDefaultTarget() {
		assertEquals("Hello, World!", source.sayHello())
	}

	@Test
	def void sayHelloToCustomTarget() {
		assertEquals("Hello, Peter!", source.sayHelloTo("Peter"))
	}
	
	@Test
	def void sayCustomHelloToCustomTarget() {
		GreetingsSource customSource = new BasicGreetingsSource(greetings: "Hi");
		assertEquals("Hi, Peter!", customSource.sayHelloTo("Peter"))
	}
}
