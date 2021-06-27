package com.rakesh.cont;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class MyString {
	
	
	public static void main(String[] args)
	{
		// getQuestionFormat();
		 
		 Date date = new Date();
		 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	        System.out.println(new Timestamp(date.getTime()));  // 2021-03-24 16:34:26.666
	                                                            // number of milliseconds since January 1, 1970, 00:00:00 GMT
	       // System.out.println(timestamp.getTime());  
	        
	        String str = Long.toString(timestamp.getTime());
	        
	        System.out.println(str);  
	        
	        String no = "7982308095";
	        
	        String part2 = no.substring(0, 8);
	        
	        String part1 = str.substring(0, 6);
	        
	        
	        String finalstr = part1+part2;
	        
	        System.out.println("finalstr ="+finalstr);
	       
		 
	}

			
			public  static String getQuestionFormat() {
		String queHeader = "";
		String msisdn="70982308095";
		String question="How many months in a year have 30 Days?";
		String options="[\"Africa\",\"Asia\"]";

		String msg = question;

		

		String[] optionList = options.split(",");
		
		
		
		

		int totalOptions = optionList.length;
		
		optionList[0] = optionList[0].substring(1);
		
		System.out.println("optionList[0]"+optionList[0]);
		
		optionList[totalOptions - 1] = optionList[totalOptions - 1].replace("]", "");
	char temp='A';
		for (int i = 0; i < totalOptions; i++) 
		{
			//int temp = i + 1;
			
			//msg += "\n" + temp + ". " + optionList[i].substring(1, optionList[i].length() - 1);
			msg += "\n" + temp + ". " + optionList[i].replace("\"", "");
			temp=(char) (temp+1);
			//System.out.println(msg);
		}

		if (queHeader != null) {
			msg += "\n" + queHeader;
			
		}

		System.out.println(msg);
		return msg;
	}
}
