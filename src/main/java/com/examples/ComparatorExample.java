package com.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ComparatorExample {

	public static void main(String[] args){
		char[] order = { 'A','C','B'};
		String[] input = {"Brahmi","Chiru","Allu"};
		sortByCharPreference(order, input);
		for(String s: input){
			System.out.println(s);
		}
	}
	public static  void sortByCharPreference(char[] order, String[] input){
		final Map<Character,Integer> preferenceMap = new HashMap<Character,Integer>();
		for(int i = 0 ; i < order.length ; i++){
			preferenceMap.put(order[i], i);
		}
		Comparator<String> StringComparator = new Comparator<String>(){

			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				Character first = arg0.charAt(0);
				System.out.println("first"+first);
				Character second = arg1.charAt(0);
				System.out.println("second"+second);
				System.out.println("preferenceMap.get(first) - preferenceMap.get(second)"+ (preferenceMap.get(first) - preferenceMap.get(second)));
				return preferenceMap.get(first) - preferenceMap.get(second);
			}
			
		};
		
		Arrays.sort(input,StringComparator);
	}
}
