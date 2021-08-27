package io.javabrains;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		 Greeter greeter = new Greeter();
		 
		 Greeting helloWorldGreet = new HelloWorldGreet();
		 // Syntactical sugar
		 Greeting lambdaGreet = () -> System.out.println("Hello World!");
		 Greeting innerClassGreet = new Greeting() {
			 public void perform() {
				 System.out.println("Hello World!");
			 }
		 };
		 
		 greeter.greet(innerClassGreet);
		 greeter.greet(helloWorldGreet);
		 greeter.greet(lambdaGreet);
		 
	}

}
