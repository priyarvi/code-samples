package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneNum {
	static final HashMap<Character,Integer> keyPad2= new HashMap<Character,Integer>();
	static {
	 keyPad2.put('a', 1);
	 keyPad2.put('b', 1);
	 keyPad2.put('c', 1);
	 keyPad2.put('d', 2);
	 keyPad2.put('e', 2);
	 keyPad2.put('f', 2);
	 keyPad2.put('g', 3);
	 keyPad2.put('h', 3);
	 keyPad2.put('i', 3);
	 keyPad2.put('j', 4);
	 keyPad2.put('k', 4);
	 keyPad2.put('l', 4);
	 keyPad2.put('m', 5);
	 keyPad2.put('n', 5);
	 keyPad2.put('o', 5);
	 keyPad2.put('p', 6);
	 keyPad2.put('r', 6);
	 keyPad2.put('s', 6);
	 keyPad2.put('t', 7);
	 keyPad2.put('u', 7);
	 keyPad2.put('v', 7);
	 keyPad2.put('w', 8);
	 keyPad2.put('x', 8);
	 keyPad2.put('y', 8);
	 keyPad2.put('z', 9);
	}
	
	public static Collection<String> getTelephoneWords(String shortNumber,Collection<String> dictionaryWords){
		Map<String,List<String>> lookUpList = new HashMap<String, List<String>>();
		
		for(String s:dictionaryWords){
			String k=getNumericString(s);
			if(!lookUpList.containsKey(k)){
	
				//lookUpList.put(k, new ArrayList<String>());
			}
			lookUpList.get(k).add(s);
			
			
		}
		
		if(lookUpList.containsKey(shortNumber)){
		return lookUpList.get(shortNumber);
		}
		else{
			
			return Collections.EMPTY_LIST;
		}
		//return Collections.EMPTY_LIST;
		
	}

	public static String getNumericString(String alphabetcString){
		StringBuilder s=new StringBuilder();
		for(Character k:alphabetcString.toCharArray()){
			//s=s+keyPad2.get(k);
			s.append(keyPad2.get(k));
		}
		
		
		return s.toString();
	}
	public static void main(String[] args){
		
		String[] words = { "abc","def","apple","iphone","ipad","google","nexus","mac","mini","maps","shuffle","tripod","camera","win","loose","text"};
		List<String> words_list = Arrays.asList(words);
		for(String s : getTelephoneWords("444",words_list) ){
			System.out.println(s);
		}
		    //System.out.println(getNumericString("bed"));
	}
}
