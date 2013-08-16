package org.amicofragile.groovy4dsl.inheritance

class DynamicGreetingsSource implements GreetingsSource {
	def String greetings;
	
	public DynamicGreetingsSource(String greetings) {
		this.greetings = greetings;
	}
	
	@Override
	def String sayHello() {
		sayHelloTo("World")
	}

	@Override
	def String sayHelloTo(String target) {
		"${greetings}, ${target}!"
	}
}
