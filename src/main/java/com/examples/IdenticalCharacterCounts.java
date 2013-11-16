package com.examples;

public class IdenticalCharacterCounts {

public boolean permutation(String s, String t){
		
		if(s.length()!=t.length()){
			return false;
		}
		int[] letters = new int[256];
		
		char[] s_array = s.toCharArray();
		
		for (char c: s_array){
			letters[c]++;
		}
		
		for (int i=0; i<t.length();i++){
			int c = (int) t.charAt(i);
			if(--letters[c] <0){
				return false;
			}
		}
		
		return true;
	}

public static void main(String[] args){
	 
	 IdenticalCharacterCounts idc = new IdenticalCharacterCounts();
	 System.out.println(idc.permutation("dogg", "god"));
	 
 }
}
