package com.rakesh.cont.program;

public class Reverseno {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseno(1234);
	}

	private static void reverseno(int no) {
		// TODO Auto-generated method stub
		
		int rev =0;
		
		while(no!= 0) // 1234
		
		{
			
			rev = rev*10 + no%10; // 4*10 + 3 = 43*10 + 2 = 432*10 + 1 =4321
			no = no/10; // 1234/10 = 123/10 = 12/10 = 1 = 0
			System.out.println("no"+no); 
		}
		
		System.out.println("reversed no is "+rev);
	}

}
