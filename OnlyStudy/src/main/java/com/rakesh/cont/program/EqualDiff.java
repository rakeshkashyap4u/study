package com.rakesh.cont.program;

import java.util.ArrayList;

public class EqualDiff {
	
	public static void main(String[] args)
    {
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        
        
        ArrayList l = new ArrayList();  // aaraylist
        
        l.add("abc");
        l.add(1);
        
        
        String [] ar = new String[10]; // aaray
       
        ar[0] = "Rakesh";
        
        ar[1] = "kashyap";
        
      //  ar[2] = 90;
       
     ArrayList <String> lar = new ArrayList<>()  ;  // aaraylist
        
     lar.add("abc");
    // lar.add(1);

   //  ArrayList <int > lars = new ArrayList<int>()
     ArrayList <Integer> lars = new ArrayList<Integer>()  ;  // aaraylist
        
    }

}
