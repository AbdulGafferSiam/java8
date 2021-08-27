package io.javabrains.unit2;

public class ClosureExample {

	public static void main(String[] args) {
		int a = 10;
		a = 2; // can override
		int b = 20;
		// b = 5; // by default b is final
		doProcess(a, i -> System.out.println(i + b));

	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}

}

interface Process {
	void process(int i);
}
