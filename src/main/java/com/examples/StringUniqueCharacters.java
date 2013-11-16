package com.examples;

public class StringUniqueCharacters {

	public static void main(String[] args) {
        String str = "test";
boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]){
             System.out.println("String contains duplicate characters");
             System.exit(1);
            }
            char_set[val] = true;
        }
        System.out.println("String contains all unique characters");
}
}
