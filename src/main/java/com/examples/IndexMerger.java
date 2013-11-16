package com.examples;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class IndexMerger {
	/**
	 * 
	 * @author Gouthami
	 *	helper structure to maintain the information of start and length of substrings.
	 */
	private static class IndexRange{
		private final int start; 
		private final int length;
		
		public IndexRange(int start,int length) {
			this.length = length;
			this.start = start;
		}
		public int getStart() {
			return start;
		}
		
		public int getLength() {
			return length;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "(" + start + "," + length + ")";
		}
	}
	/**
	 * 
	 * @param charMap
	 * @return the best IndexRange (shortest)
	 * @throws Exception
	 */
	private static IndexRange getBestIndexRange(Map<Character,List<Integer>> charMap) throws Exception{
		
		for(Character ch : charMap.keySet()){
			System.err.print(ch + ": { ");
			for(Integer i : charMap.get(ch)){
				System.err.print( i + " ");
			}
			System.err.println( "}");
		}
		
		List<IndexRange> computedIndices = new LinkedList<IndexRange>();
		for(Character ch : charMap.keySet()){
			System.err.print(ch + "\t");
			for(IndexRange ir: computedIndices){
				System.err.print(ir);
			}
			System.err.println();
			if(computedIndices.isEmpty()){
				for(Integer start: charMap.get(ch)){
					computedIndices.add(new IndexRange(start,1));
				}
			}else{
				
				List<Integer> charIndices = charMap.get(ch);
				int i1 = 0,i2 = 0;
				List<IndexRange> newRanges = new LinkedList<IndexRange>();
				while(i1 < charIndices.size() && i2 < computedIndices.size()){
					int charIndex = charIndices.get(i1);
					IndexRange ir = computedIndices.get(i2);
					if(charIndex > ir.getStart()){
						if(charIndex >= ir.getStart() + ir.getLength()){
							newRanges.add(new IndexRange(ir.getStart(),charIndex - ir.getStart() + 1));
						}else{
							newRanges.add(ir);
						}
						i2++;
					}else{
						newRanges.add(new IndexRange(charIndex,ir.getStart() + ir.getLength() - charIndex));
						i1++;
					}
				}
				computedIndices = newRanges;		
			}	
		}
		int minLength = -1;
		IndexRange minRange = null;
		for(IndexRange ir: computedIndices){
			if(minLength < 0  || minLength > ir.getLength()){
				minLength = ir.getLength();
				minRange = ir;
			}
		}
		if(minRange == null){
			throw new Exception("Could not find any suitable substring indices");
		}
		return minRange;
	}
	/**
	 * 
	 * @param corpus - the big string in which we are supposed to find the substring
	 * @param query - the smaller string. 
	 * @return Map of characters (in query string) to indices in corpus
	 * @throws Exception
	 */
	private static Map<Character,List<Integer>> getAllQueryCharacterIndices(String corpus,String query)
			throws Exception{
		Map<Character,List<Integer>> charMap = new HashMap<Character, List<Integer>>();
		Set<Character> charSet = new HashSet<Character>();
		for(int i = 0; i < query.length() ; i++){
			charSet.add(query.charAt(i));
		}
		for(int i =0; i< corpus.length(); i++){
			Character currentChar = corpus.charAt(i);
			if(charSet.contains(currentChar)){
				if(!charMap.containsKey(currentChar)){
					charMap.put(currentChar, new LinkedList<Integer>());
				}
				charMap.get(currentChar).add(i);
			}
		}
		if(charMap.keySet().size() != charSet.size()){
			throw new Exception("Not all chars are found in the given search string");
		}
		return charMap;
	}
	
	/**
	 * 
	 * @param corpus
	 * @param query
	 * @return the best substring in the corpus
	 */
	public static int getBestSubstring(String corpus, String query){
		try{
			Map<Character,List<Integer>> charMap = getAllQueryCharacterIndices(corpus, query);
			IndexRange ir = getBestIndexRange(charMap);
			//return corpus.substring(ir.getStart(), ir.getStart() + ir.getLength());
			return ir.getLength();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return -1;
	}
	public static void main(String[] args){
		//System.out.println(getBestSubstring( "xbcdedefffsdasdebzzaxxxxxxba", "ba"));
		System.out.println(getBestSubstring( "dosbdafceeazbaz", "eba"));
		//System.out.println(getBestSubstring( "xbcdedefffsdasdebzzabe", "dbae"));
	}

}
