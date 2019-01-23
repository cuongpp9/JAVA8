package com.cuongpp.terralogic.Examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Example implements listExamples {

	@Override
	public void forEachExample() {
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Consumer<Integer> action = System.out::println;
		
		//Normal for
		System.out.println("Normal for (1, 2, 3, 4, 5): ");
		for (Integer num : numberList) { 		      
	           System.out.println(num); 		
	    }

		System.out.println("Stream forEach (1, 2, 3, 4, 5): ");
		numberList.stream().filter(n -> n % 2 == 0).forEach(action);
		
		
		System.out.println("ForEach using List (1, 2, 3, 4, 5): ");
		numberList.forEach(action);

		System.out.println("ForEach using Map: ");
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		// 1. Map entries
		Consumer<Map.Entry<String, Integer>> actionMap = System.out::println;
		System.out.println(" 1.Map entries: ");
		map.entrySet().forEach(actionMap);

		System.out.println(" 2.Map Keys: ");
		// 2. Map keys
		Consumer<String> actionOnKeys = System.out::println;
		map.keySet().forEach(actionOnKeys);

		System.out.println(" 3.Map values: ");
		// 3. Map values
		map.values().forEach(action);

		// Custom Action
		Consumer<Map.Entry<String, Integer>> customAction = entry -> {
			System.out.println("entry: " + entry);
			System.out.println("Key is : " + entry.getKey());
			System.out.println("Value is : " + entry.getValue());
		};
		map.entrySet().forEach(customAction);

	}

	@Override
	public void streamExample() {
		System.out.println("Stream of Value && Stream of Element: ");
        Stream<Integer> stream1 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream1.forEach(p -> System.out.println(p));
        
        System.out.println("List stream: ");
		List<String> list = new ArrayList<String>();
		list.add("viettinbank");
		list.add("acb");
		list.add("Dong A");
		list.add("OCB");
		
        list.stream()
        .filter(s -> s.startsWith("a"))
        .map(String::toUpperCase)
        .forEach(c -> System.out.println(c));
        
	}

	@Override
	public void boxedStreamExample() {
		// TODO Auto-generated method stub

	}

}
