package com.in28minutes.junit.helper;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		
		List<Integer> list = map.values().stream().sorted().collect(Collectors.toList());
		
		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

}
