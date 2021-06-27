package com.rakesh.cont;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.UUID;



public class Study1 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String option="spPassword=[UUID#]";
		
		try {
			msgAdditionParameter(option);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static  Properties msgAdditionParameter(String input) throws NoSuchAlgorithmException {
		
		Properties fix = new Properties();
		
		String[] strings = input.split("&");

		System.out.println( "msgformat option: "+ input  );

		List<String> seqStr = sequenceStr(strings);

		System.out.println( "msgformat option after format: "+ seqStr  );

		for(String str : seqStr) {
			String[] pair = str.split("=");
			
			if(pair[0].equals("APIKey")) {
				String keyvalue = pair[1].substring(1, pair[1].length()-2);
				System.out.println("here u are");
				String calculateData= "";
			}

			else if(!pair[1].contains("[")) {
				String value = null;
				System.out.println("here u are 2");
				try {
					value = URLDecoder.decode(pair[1], StandardCharsets.UTF_8.toString());
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				} 
				fix.put(pair[0], value);
			}

			else {
				String keyvalue = pair[1].substring(1, pair[1].length()-1);

				String calculateData = "";
				
				

				if(keyvalue.contains("#")) {
					System.out.println("here u are 3");
					String data = "";
					String value = null;
					String hashmtd = "";
					String[] parameter = keyvalue.split("#");
					for(int i = 0 ;i<parameter.length ; i++) {

						if(i==0) 
							hashmtd = parameter[0];
						else {
							value = null;
							String current = parameter[i];
							if(current.contains("@")) {
								value = findFormatValue(current);
							}
							else {
								if(fix.containsKey(current))
									value = fix.getProperty(current);
							}
							data += value;
						}
					}

					if(hashmtd.equals("md5"))
						calculateData = md5Hash(data);

					if(hashmtd.equals("concat")) {
						calculateData = data;
					}

					if(hashmtd.equals("UUID")) {
						calculateData = uuidGenerator().toString();
					}

					/*if(hashmtd.equals("API")) {
						if(CoreUtils.getProperty("operator").equals("TIGO") && CoreUtils.getProperty("country").equals("TZA"))
						calculateData = "Bearer "+TokenAPI();
					}*/

					System.out.println( "hash mtd: "+ hashmtd + " data string: "
							+ data + " calculated data: "+calculateData);
					fix.put(pair[0], calculateData);
				}

				else {

					if(keyvalue.contains("@")) {
						String value = findFormatValue(keyvalue);
						fix.put(pair[0], value);
					}
				}
			}
		}
		System.out.println( "addition properties: "+ fix );
		return fix;
		// TODO Auto-generated method stub
		
	}

	public static UUID uuidGenerator() {

		//		UUID uuid1 = Generators.randomBasedGenerator().generate();
		UUID uuid1 = UUID.randomUUID();

		return uuid1;
	}

	public static String md5Hash(String plaintext) throws NoSuchAlgorithmException {

		MessageDigest m = MessageDigest.getInstance("MD5");
		m.reset();
		m.update(plaintext.getBytes());
		byte[] digest = m.digest();
		BigInteger bigInt = new BigInteger(1,digest);
		String hashtext = bigInt.toString(16);

		while(hashtext.length() < 32 ){
			hashtext = "0"+hashtext;
		}
		return hashtext;
	}
	
	public static String findFormatValue(String data) {

		String[] pair = data.split("@");
		String value = null;
		if(pair[0].equals("dateformat")) {

			SimpleDateFormat formatter = new SimpleDateFormat(pair[1]); 
			Date date = new Date(); 
			value = formatter.format(date);
		}
		return value;
	}

	
		public static List<String> sequenceStr(String[] strings) {

			List<Integer> staticStr = new ArrayList<Integer>(); 
			List<Integer> formatStr = new ArrayList<Integer>(); 
			List<Integer> calculateStr = new ArrayList<Integer>();

			for(int i = 0 ; i<strings.length ; i++) {
				if(!strings[i].contains("[")) {
					staticStr.add(i);
				}

				else {
					if(strings[i].contains("@"))
						formatStr.add(i);

					else if(strings[i].contains("#"))
						calculateStr.add(i);
				}
			}

			List<String> seqStr = new ArrayList<String>();

			for(int p = 0 ; p<staticStr.size() ; p++)
				seqStr.add(strings[staticStr.get(p)]);

			for(int q = 0 ; q<formatStr.size() ; q++)
				seqStr.add(strings[formatStr.get(q)]);

			for(int r = 0 ; r<calculateStr.size() ; r++)
				seqStr.add(strings[calculateStr.get(r)]);

			return seqStr;

		}


	}


