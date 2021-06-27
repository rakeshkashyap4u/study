package com.rakesh.cont;

import java.util.ArrayList;
import java.util.List;

public class JavaEight {
	
	
	public static void main(String [] args) 
	{
		
		 // Lambda expression with single parameter.  
        Sayable s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Sonoo"));  
          
        // You can omit function parentheses    
        Sayable s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Sonoo"));  
      
    
	
	List<MyEntity> list=new ArrayList<MyEntity>();  
   
	MyEntity mye = new MyEntity();
	
	
	
			
      
    list.forEach(  
        (n)->System.out.println(n)  
    );  
} 
}

		
	


interface Sayable{  
    public String say(String name);  
}  



