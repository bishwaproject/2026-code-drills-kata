package com.drills.kata01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
 * Task: Create a Map of Names of Ages
 * Apply Generics: ensure the Map is type-safe
 * Stream & Lambda: filters for ages > 18, transform names to uppercase,
 * and collect into a TreeSet (to keep them sorted).
 * result: you just practiced Maps, Sets, Generics, Streams, and Lambdas in 10 lines of code.
 */

public class Drill1 {
	
	public static void main(String[] args) {
		Map<String, Integer> people1 = Map.of(
				"alice", 17,
				"bob", 25,
				"charlie", 19,
				"dave", 15,
				"eve", 25
				
				);
		
		Map<String, Integer> people = new HashMap<String, Integer>();
		people.put("alice", 17);
		people.put("bob", 25);
		people.put("charlie", 19);
		people.put("dave", 15);
		people.put("eve", 25);
		
		Set<String> adults =
				people.entrySet()
				.stream()
				.filter(e -> e.getValue() > 18)
				.map(e -> e.getKey().toUpperCase())
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(adults);
	}
	

}
