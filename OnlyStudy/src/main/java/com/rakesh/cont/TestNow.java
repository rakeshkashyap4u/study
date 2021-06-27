package com.rakesh.cont;


public class TestNow {
	
	
	public static void main(String [] args)
	{
		getQuestionFormatforDemo();
	}
	
	
	public  static String getQuestionFormatforDemo() {
		String queHeader = "";
		String msisdn="70982308095";
		String question="How many months in a year have 30 Days?";
		String options="[RK,NK]";

		String msg = question;

		

		String[] optionList = options.split(",");
		
		

		int totalOptions = optionList.length;
		
		optionList[0] = optionList[0].substring(1);
		
		optionList[totalOptions - 1] = optionList[totalOptions - 1].replace("]", "");
	char temp='A';
		for (int i = 0; i < totalOptions; i++) 
		{
			//int temp = i + 1;
			
			//msg += "\n" + temp + ". " + optionList[i].substring(1, optionList[i].length() - 1);
			msg += "\n" + temp + ". " + optionList[i];
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
