package org.amicofragile.groovy4dsl.inheritance;

import static org.junit.Assert.*;

import org.junit.Test;

public class CrazyGreetingsSourceTest {
	@Test
	public void sayCrazyHelloToDefaultTarget() throws Exception {
		GreetingsSource source = new CrazyGreetingsSource();
		assertEquals("AAAAAAAH, World!", source.sayHello());
	}
}
