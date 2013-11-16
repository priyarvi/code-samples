/* amazon-interview-questions 

Write a program that takes an array of numbers, and then prints out all the possible pairs of numbers that sum up to the value N.
E.g., if the array contains the numbers {0, 1, 2, 2, 3, 4, 5} and the target value N is 4, then the output would be (0, 4), (1, 3), (2, 2).*/


package com.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TargetSum {

	public static void main(String[] args) {
		final Map<Integer, Integer> values = new HashMap<Integer, Integer>();
		final Map<Integer, Integer> sumOfPair = new HashMap<Integer, Integer>();

		final int targetVal = 4;
		int key = 0;
		final int[] arrayOfNums = { 0, 1, 2, 2, 3, 4, 5 };
		for (int i : arrayOfNums) {
		values.put(key, i);
		if ((values.containsValue(targetVal - i)) && ((targetVal - i) != i)) {
		sumOfPair.put(i, (targetVal - i));
		}
		key++;
		}
		Iterator<Map.Entry<Integer, Integer>> entries = sumOfPair.entrySet().iterator();
		while (entries.hasNext()) {
		Map.Entry<Integer, Integer> entry = entries.next();
		System.out.print("(" + entry.getKey() + "," + entry.getValue()+") ");
		}
		}
}
