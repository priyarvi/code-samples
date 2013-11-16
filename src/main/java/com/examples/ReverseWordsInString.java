package com.examples;

public class ReverseWordsInString {

	public static void main(String[] arg) {
		String str = "This is a String";
		String finalStr = "";
		String[] arr = str.split(" ");
		for (int i = (arr.length - 1); i >= 0; i--) {
			/*if (i == 0)
				finalStr = finalStr+arr[i];
			else*/
				finalStr = finalStr + arr[i] + " ";
		}
		// is name myhello
		System.out.println("Reverse words =>" + finalStr);
	}
}
