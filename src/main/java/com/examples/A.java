package com.examples;

class A {
	  public static void main(String sArgs[]) {
	    String a=new String("hello");
	    String b=a;
	    System.out.println("a: "+ a + " b: " + b);
	    if (b==a) System.out.println("ab1"); 
	    a=a+" world";
	    System.out.println("a: "+ a + " b: " + b);
	    if (a!=b) System.out.println("ab2");

	    StringBuffer c=new StringBuffer("hello");
	    StringBuffer d=c;
	    System.out.println("c: "+ c + " d: " + d);
	    if (d==c) System.out.println("cd1");
	    c.append(" world");
	    System.out.println("c: "+ c + " d: " + d);
	    if (d==c) System.out.println("cd2");
	  }
	}
