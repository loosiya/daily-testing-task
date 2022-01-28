package org.day4;
public class Command_line {
public static void main(String[] args) {
		
		System.out.println("ADDITION OPERATION");
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double c= a+b;
		System.out.println("ADDITION="+c);
	    
		System.out.println("MULTILPE OPERATION");
		float d=Float.parseFloat(args[0]);
		float e=Float.parseFloat(args[1]);
		float f=d*e;
		System.out.println("mutiplication="+f);

		for (int i = 0; i < args[2].length(); i++) {
		char g= args[2].charAt(i);
		System.out.println(g);
		}
		
		System.out.println("SUBTRCTION OPERATION");
		int h=Integer.parseInt(args[0]);
		int i=Integer.parseInt(args[1]);
		int j=h-i;
		System.out.println("subtaction ="+j);
		
		System.out.println("DIVISION OPERATION");
		long k=Long.parseLong(args[0]);
		long l=Long.parseLong(args[1]);
		long m=k/l;
		System.out.println("division="+m);
		
		System.out.println("CONCATINATION OPERATION");
		System.out.println("concat ="+args[3]+args[4]);
		
		
		
		
		 
	

	}
		
	}


