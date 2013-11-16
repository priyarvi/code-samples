package com.examples;

import java.util.Arrays;

public class Anagram {

	String sort(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);	
		return new String(content);
	}
	
	boolean permutation(String s, String t){
		
		if(s.length()!=t.length()){
			return false;
		}
		return sort(s).equals(sort(t));
	}
	
	public static void main(String[] args){
		Anagram ana= new Anagram();
		System.out.println(ana.permutation("god", "odg"));
		
	}
}
