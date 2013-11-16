package com.examples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationListofLists {
	
	
	public static void printPermutations(List<List<Character>> masterList, List<Integer> indices){
		
		if(indices != null && indices.size()>=masterList.size()){
			String s= new String();
			for(int i=0;i<indices.size();i++){
				int index=indices.get(i);
				s += masterList.get(i).get(index);				
			}
			System.out.println(s);
		} else {
			
			int masterIndex = (indices == null) ? 0 : indices.size();
			for(int i=0;i<masterList.get(masterIndex).size();i++){
				List<Integer> newIndices = new ArrayList<Integer>();
				
				if(indices!=null){					
					newIndices.addAll(indices);
				}
				newIndices.add(i);
				printPermutations(masterList, newIndices);
			}
			
		}
		
		
	}
	
	public static void main(String[] args){
		
	
		List<List<Character>> charLists = new ArrayList<List<Character>>();
		charLists.add(Arrays.asList(new Character[]{'a','b','c'}));
		charLists.add(Arrays.asList(new Character[]{'d','e','f','g'}));
		charLists.add(Arrays.asList(new Character[]{'h','i','j'}));
		charLists.add(Arrays.asList(new Character[]{'k','l','m','n','o'}));
		printPermutations(charLists, null);
		
	}
	
	

}
