package org.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Other_input {
	public static void main(String[] args) throws IOException  {
		
	
	InputStreamReader g=new InputStreamReader(System.in);
	BufferedReader b=new BufferedReader(g);
	
	System.out.println("Enter the value of s:");
	String s=b.readLine();
	
	
	System.out.println("Enter the value of c:");
	int c=b.read();
	System.out.println("Enter the float value");
	float h=Float.parseFloat(s);
    System.out.println(h);
    System.out.println("Enter the double value");
    Double n=Double.parseDouble(s);
    System.out.println(n);
	
}
}
