package com.examples;

import java.util.HashSet;

public class DupsinArray {
	
	public static void main(String[] args) {

	    int[] a = {3,5,5,8,9,9,9,9,9,9};

	    HashSet<Integer> hash = new HashSet<Integer>();

	    for(int i = 0; i < a.length; i++){

	        for(int j = i+1; j< a.length; j++){
	        	System.out.println("a[i] a[j]"+ a[i] +   a[j]);
	            if(a[i] == a[j]){
	            	

	                hash.add(a[i]);

	            }
	        }


	    }

	    System.out.println(hash);

	    }
	}
