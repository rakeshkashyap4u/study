package com.rakesh.cont;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class EncodeDecode {
	
	
	
	
	public static void main(String [] args) throws UnsupportedEncodingException
	{
		
		
		String msg = "تم تفعيل مسابقة إتصل واربح اليوميه ب 50 ليره. اتصل علي 1044 لتبدا المسابقه او ارسل 0 الي 1044 لالغاء الخدمة";
		//System.out.println(URLDecoder.decode(msg, "UTF-32")); 
		
		
      try{
            

//            System.out.println("!------->" +
//                new String(msg.getBytes("UTF-32"),"ASCII"));
//            
            String   mainmsg =  new String(msg.getBytes("UTF-32"),"ASCII");
            
            
            System.out.println("decoded ---->"+mainmsg);
            
            
            encode(mainmsg);  
           
            
        }
        catch(Exception E){
        }
		
		
	}
	
	
	
	public  void decode(String msgr) 
    {
        try{
            

            System.out.println("!------->" +
                new String(msgr.getBytes("UTF-8"),"ASCII"));
        }
        catch(Exception E){
        }
    }
	
	
	 public static    void encode(String margs)  
             throws UnsupportedEncodingException  
{ 
// encoded string 

System.out.println("Encoded String :"); 
System.out.println(margs); 

// decode() method 
System.out.println("Decoded String :"); 
System.out.println(URLDecoder.decode(margs, "UTF-8")); 
} 





}
