package com.rakesh.cont;


interface InterF 
{
	public void m();
	
	
}


public class LambdabyFI 

{
	
	public static void main(String[] args) {
		
		InterF itf = () -> System.out.println("Heloo by lamda..");	
		itf.m();
		
	}
	

}


