package com.rakesh.cont;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;




public class Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String PpresharedKey = "Wo3Iyh3jNyzkRDNJ";
		String PServiceId = "2062";
		
		String phrasetoEncrypt = PServiceId + "#" +System.currentTimeMillis();   
		String encryptionAlgorithm = "AES/ECB/PKCS5Padding";
		String encrypted = "";
		try {    Cipher cipher = Cipher.getInstance(encryptionAlgorithm); 
		SecretKeySpec key = new SecretKeySpec(PpresharedKey.getBytes(), "AES"); 
		cipher.init(Cipher.ENCRYPT_MODE, key);  
		final byte[] crypted = cipher.doFinal(phrasetoEncrypt.getBytes());
		encrypted = Base64.getEncoder().encodeToString(crypted); 
		
		System.out.println(encrypted);
		
		String msis= "51955624932";
		
		String pid ="15684";
		
		
		
		String finalno = "51955624932#15684#"+System.currentTimeMillis();
		
		System.out.println("fno"+finalno);
		
		final byte[] fcrypted = cipher.doFinal(finalno.getBytes());
		
		
		String msencrypted = Base64.getEncoder().encodeToString(fcrypted); 
		
		System.out.println("..............");
		
		System.out.println(fcrypted);
		
		
		
		} 
		catch (Exception e) {
			//Logger.sysLog(LogValues.error, this.getClass().getName(), "Exception "+ Logger.getStack(e));
		}  
		
		
		
	}

}
