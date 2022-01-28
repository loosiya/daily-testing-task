package org.day4;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		int mul;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 1; i <=100; i++) {
			
			mul=n*i;
			System.out.println(mul);
			
		}

	}

}
