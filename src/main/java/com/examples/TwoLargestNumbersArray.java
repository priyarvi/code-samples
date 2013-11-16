package com.examples;
import java.util.*;
public class TwoLargestNumbersArray {
	

	
	    public static void main(String[] args) {
	        int secondlargest = 0;
	        int largest = 0;
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter array values: ");
	        int arr[] = new int[5];
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = input.nextInt();
	            if (largest < arr[i]) {
	                secondlargest = largest;
	                largest = arr[i];
	            }
	            if (secondlargest < arr[i] && largest != arr[i])
	                secondlargest = arr[i];
	        }
	        System.out.println("Largest number is: " + largest);
	        System.out.println("Second Largest number is: " + secondlargest);
	    }
	}

