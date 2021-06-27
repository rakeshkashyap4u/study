package com.rakesh.cont;

public class StudyStart {

	
		
		
		public static void main(String[] args) {    
	        String string = "Cher utilisateur,Vous avez active avec succes le Portail Christianisme a 10u.Composez le 1089 pour profiter du service.";
	        
	        int count = 0;    
	            
	        //Counts each character except space    
	        for(int i = 0; i < string.length(); i++) {    
	            if(string.charAt(i) != ' ')    
	                count++;    
	        }    
	            
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);    
	    }  

	}


