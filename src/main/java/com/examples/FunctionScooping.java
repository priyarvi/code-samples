package com.examples;

public class FunctionScooping {
	
	//private int a =10;
	//private int b=20;

	public void sum(int a,int[] arr){		
		for(int i = 0; i < arr.length ; i++){
			arr[i] += a;
		}
		arr = new int[]{1,2,3,4,5};
	}
	
	
	public int sum2(int a,int b){
		b = b +a;
		
		return b;
	}
	
	public static void main(String[] args){
		
		FunctionScooping fs=new FunctionScooping();
		
	int[] arr  = new int[]{1,2,3,4,5,6,7,8,9,10};
	
	fs.sum(10,arr);
	for(int a : arr){
		System.out.println(a);
	}
	
	int a = 10, b =20;
	fs.sum2(a,b);
	System.out.println(b);
		
	}
}
