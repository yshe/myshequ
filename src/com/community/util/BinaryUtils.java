package com.community.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @deription:转换为16进制
 * @author Ma
 *
 */
public class BinaryUtils {
	/**
	    * Convert byte[] to hex string.这里我们可以将byte转换成int，然后利用Integer.toHexString(int)来转换成16进制字符串。
	    * @param src byte[] data
	    * @return hex string
	    */   
	   public static String bytesToHexString(byte[] src){
	       StringBuilder stringBuilder = new StringBuilder("");
	       if (src == null || src.length <= 0) {
	           return null;
	       }
	       for (int i = 0; i < src.length; i++) {
	           int v = src[i] & 0xFF;
	           String hv = Integer.toHexString(v);
	           if (hv.length() < 2) {
	               stringBuilder.append(0);
	           }
	           stringBuilder.append(hv);
	       }
	       return stringBuilder.toString();
	   }
	   /**
	    * Convert hex string to byte[]
	    * @param hexString the hex string
	    * @return byte[]
	    */
	   public static byte[] hexStringToBytes(String hexString) {
	       if (hexString == null || hexString.equals("")) {
	           return null;
	       }
	       hexString = hexString.toUpperCase();
	       int length = hexString.length() / 2;
	       char[] hexChars = hexString.toCharArray();
	       byte[] d = new byte[length];
	       for (int i = 0; i < length; i++) {
	           int pos = i * 2;
	           d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
	       }
	       return d;
	   }
	   /**
	    * Convert char to byte
	    * @param c char
	    * @return byte
	    */
	    private static byte charToByte(char c) {
	       return (byte) "0123456789ABCDEF".indexOf(c);
	   }
	    
	    //十进制转换16进制
	    public static String convertIntToBinary ( Long value){

			  	return Long.toHexString(value);

			 }
	    
	    public static String addZero(String i){
			   while(i.length()<16){
				   i="0"+i;
			   }
			   return i;
		   }
	    
	    //传入了需要补的长度
	    public static String addZero(String i,int length){
	    	while(i.length()<length){
	    		i="0"+i;
	    	}
	    	return i;
	    }
	    
	    /**
	     * 訂單的key值(時間)翻轉eg:0x54CB5E79--------->795ECB54
	     * @param args
	     */
	    public static String convertReversal(String b){
	    	String a="";
	    	for(int i=b.length();i>=1;){
	    		a=a+b.substring(i-2,i);
	    		i=i-2;
	    	}
	    	return a;
	    }
	    

	public static void main(String args[]){
	}
}
