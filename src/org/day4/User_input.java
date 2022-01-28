package org.day4;

import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		sc.next();
		System.out.println("Enter the roll no:");
		sc.nextInt();
		System.out.println("Enter the acc no: ");
		sc.nextLong();
		System.out.println("Enter the cgpa");
		sc.nextFloat();
		System.out.println("enter the total marks:");
		sc.nextDouble();
	

	}

}
