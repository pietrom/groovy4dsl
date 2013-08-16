package org.amicofragile.groovy4dsl.inheritance

class DynamicGreetingsSource implements GreetingsSource {
	private String greetings;
	
	@Override
	def String sayHello() {
		sayHelloTo("World")
	}

	@Override
	def String sayHelloTo(String target) {
		"${greetings}, ${target}!"
	}
}
