package org.day4;

public class Default_con {
	String name1;
	String name2;
	Default_con()
	{
		
		System.out.println("s1:"+name1);
		System.out.println("s2:"+name2);
		System.out.println("this is default constructor");
	}
	
	
	Default_con(String val1,String val2 )
	{
		name1=val1;
		name2=val2;
		System.out.println("enter the name of val1 is:"+val1);
		System.out.println("enter the name of val2 is:"+val2);
	}

	public static void main(String[] args) {
		Default_con r=new Default_con();
		Default_con j=new Default_con("circle","rectangle");
		

	}

}
