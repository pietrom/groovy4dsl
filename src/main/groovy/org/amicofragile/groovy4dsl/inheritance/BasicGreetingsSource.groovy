package org.amicofragile.groovy4dsl.inheritance

class BasicGreetingsSource implements GreetingsSource {

	@Override
	def String sayHello() {
		"Hello, World!"
	}

	@Override
	def String sayHelloTo(String target) {
		"Hello, ${target}!"
	}
}