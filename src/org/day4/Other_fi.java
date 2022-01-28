package org.day4;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class Other_fi {

	public static void main(String[] args) throws IOException {
		File p=new File("D:\\lava");
	FileReader f=new FileReader(p);
	BufferedReader b=new BufferedReader(f);
	String s=b.readLine();
	System.out.println(s);
	

	}

}
