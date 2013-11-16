package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Gouthami
 * input - { "abc","cab","bca", "act","cat","bat","tab", "xyz"}
 * - should return : 
 * -- order not important
 * { 
 *   { "abc","cab","bca"},
 *   {"act","cat"},
 *   {"bat","tab"},
 *   {"xyz"}
 * }
 */
public class DictionaryAnagram {
	
	public  Collection<List<String>> anagram(List<String> input){
		
		Map<String,List<String>> charMap = new HashMap<String, List<String>>();
		
		for(String s:input){
			char[] chararr=s.toCharArray();
		   Arrays.sort(chararr);
		   String sortedString = new String(chararr);
		    if(!charMap.containsKey(sortedString)) {
		    	charMap.put(sortedString, new ArrayList<String>());
		    }
		    	
		    	charMap.get(sortedString).add(s);
		    
		}
		
		Collection<List<String>> finalLists = new ArrayList<List<String>>();
		
		for(String k:charMap.keySet()){
			//System.out.println(charMap1.get(s));
			finalLists.add(charMap.get(k));
		}
		
		return finalLists;
	}
	
	public static void main(String[] args){
		
		String[] words={"abc","cab","bca", "act","cat","bat","tab", "xyz"};
		DictionaryAnagram da = new DictionaryAnagram();
		//Map<String,List<String>> charMap1 = new HashMap<String, List<String>>();
		Collection<List<String>> finalLists =da.anagram(Arrays.asList(words));
		for(List<String> s:finalLists){
		// for(String k:s)
		 Iterator<String> it=s.iterator();
		// System.out.print(it.next());
		 while(it.hasNext())
		 {
			 System.out.print(it.next());
			 if(it.hasNext()){
			 System.out.print("-");
			 }
		 }	System.out.print("\n");
		
		}
		
		
		
	}

}
