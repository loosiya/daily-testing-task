package org.day4;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("CALCULATOR OPERATIONS");
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the data");
        String data=sc.next();
        switch (data) {
		case "add":
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		int add=a+b;
		System.out.println(add);
		break;
		case "sub" :
			System.out.println("enter the value of p");
			int p=sc.nextInt();
			System.out.println("enter the value of q");
			int q=sc.nextInt();
			int sub=p-q;
			System.out.println(sub);
			break;
		case "mul":
			System.out.println("enter the value of s");
			int s=sc.nextInt();
			System.out.println("enter the value of t");
			int t=sc.nextInt();
			int mul=s*t;
			System.out.println(mul);
			break;
		case "div":
			System.out.println("enter the value of m");
			int m=sc.nextInt();
			System.out.println("enter the value of n");
			int n=sc.nextInt();
			int div=m/n;
			System.out.println(div);
			break;
			
		default:
			System.out.println("the operation is done");
			break;
		}
	}
}


