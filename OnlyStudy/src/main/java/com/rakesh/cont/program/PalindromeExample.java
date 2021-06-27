package com.rakesh.cont.program;

public class PalindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mainno = 12123;
		
		int revno = reverse(mainno);
		
		if(mainno == revno)
		{
		System.out.println("no is palindrome");	
		}
		else
		{
			System.out.println("no is not palindrome");	
		}

		System.out.println("reversed no is "+revno);
	}

	private static int reverse(int num) {
		// TODO Auto-generated method stub
		
		int rev=0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		
		
		return rev;
	}

}
