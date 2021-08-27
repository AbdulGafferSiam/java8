package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseSolJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Albert", "Einstein", 96),
				new Person("Warner", "Hisenberg", 70),
				new Person("Marry", "Qury", 96),
				new Person("Nicola", "Tesla", 96),
				new Person("Eisek", "Newton", 396)
				);

		// Step:1 Sort list by lastname
		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

		// Step:2 Create a method that print all element in the list
		System.out.println("Print all person:");
		printConditionally(people, p -> true);

		// Step:3 Create a method that print all people last name beginning with H
		System.out.println("Print person whom last name begin with H:");
		printConditionally(people, p -> p.getLastName().startsWith("H"));

		System.out.println("Print person whom first name begin with A:");
		printConditionally(people, p -> p.getFirstName().startsWith("A"));
	}

	// Function interface Predicate
	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for(Person p : people) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}

	}

}
