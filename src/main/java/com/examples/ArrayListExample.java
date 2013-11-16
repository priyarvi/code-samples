package com.examples;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {
	
	public static void main(String[] args){
	
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		numbers.remove(0);
		numbers.remove(numbers.size()-1);
		for (int i =0; i<numbers.size();i++){
			System.out.println(numbers.get(i));
		}
		System.out.println(numbers.size());
		for (Integer test:numbers){
			
			System.out.println(test);
		}
				
		
	}
}
