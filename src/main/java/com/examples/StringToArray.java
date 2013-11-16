package com.examples;

import java.util.Arrays;

public class StringToArray
{
	public static void main(String[] args) {
		 
		String password = "password123";
		char[] passwordInCharArray = password.toCharArray();
 
		for(char temp: passwordInCharArray){
			System.out.println(temp);
		}
	}
}