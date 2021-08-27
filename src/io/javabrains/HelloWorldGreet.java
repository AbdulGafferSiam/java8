package io.javabrains;

public class HelloWorldGreet implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello World!");
	}

}
