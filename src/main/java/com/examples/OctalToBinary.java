package com.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OctalToBinary {
	
	    public static void main(String[] args)throws Exception{
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter octal number: ");
	        String oct = br.readLine();
	        int i= Integer.parseInt(oct,8);
	        String binary=Integer.toBinaryString(i);
	        System.out.println("Octal Number: "+binary);
	    }
	

}
