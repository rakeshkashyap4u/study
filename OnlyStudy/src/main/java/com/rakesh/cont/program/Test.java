package com.rakesh.cont.program;

import java.lang.reflect.Method;

 class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class c = Class.forName("java.lang.Object ");
		
		int count =0;
		
		Method m[] = c.getDeclaredMethods();
		
		for ( Method met : m)
		{
			count ++;
			System.out.println(met.getName());
		}
		
		System.out.println("the no of method is "+count);

		
		
	}

}

 class Student {

	
	public String getname()
	{
		return null;
		
	}
	
	
	public String get()
	{
		return null;
		
	}
}
