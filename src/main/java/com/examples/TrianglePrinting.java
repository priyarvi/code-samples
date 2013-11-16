
/*
Print below series in java
*** 1***
**2 *2**
*3*3*3*
4*4*4*4 */

package com.examples;

public class TrianglePrinting {

	public static void main(String arg[]){
		int height = 4;
		
		for(int i=0;i<height;i++ ){
			for(int j=height-1;j>i;j--){
				System.out.print("*");
			}
			
			boolean printChar = false;
			for(int j=0;j<((i*2)+1);j++){
				if( printChar ){
					System.out.print("*");					
				}
				else{
					System.out.print(i+1);
				}
				printChar = !printChar;
			}
			
			for(int j=height-1;j>i;j--){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
