package com.rakesh.cont.program;

public class CheckPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	 // checkPrime(1);  
	  checkPrime(9);  
	 // checkPrime(17);  
	//  checkPrime(20); 

	}

	static void checkPrime(int n)
	{  
		  int i,m=0,flag=0;      
		   
		 
		  if(n==0||n==1)
		  {  
		   System.out.println(n+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=n-1;i++)
		   {      
		    if(n%i==0)
		    {      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  
		   { 
			   System.out.println(n+" is prime number"); }  
		  }//end of else  
		
	} 
	
	
}
