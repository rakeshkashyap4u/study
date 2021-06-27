package com.rakesh.cont;


 interface Interfa
{
	public void add(int a, int b);
}


public class StudyLamda2 { 
	
	
	
public static void main(String[] args) {
		
	Interfa inter = (a,b) -> System.out.println("the sum is ="+(a+b));
		inter.add(10, 90);
		inter.add(1000000, 908775444);
	}
	

	
	
	
	
	

}
