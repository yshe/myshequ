package com.community.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** 
 * @ClassName: RandomUtil 
 * @Description: 
 * @author wzx
 * @date 2014年12月31日 上午6:28:20  
 */
public class RandomUtil {
	
	/**
	 * @Description:  获取一个四位含字母/数字的验证码
	 * @param @return
	 * @return String
	 * @throws
	 */
	public static String getRandomCode(){
		String[] beforeShuffle = new String[] { "0", "1", "2", "3", "4", "5", "6", "7",  
                "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",  
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",  
                "W", "X", "Y", "Z" };  
	    List list = Arrays.asList(beforeShuffle);  
	    Collections.shuffle(list);  
	    StringBuilder sb = new StringBuilder();  
	    for (int i = 0; i < list.size(); i++) {  
	        sb.append(list.get(i));  
	    }  
	    String afterShuffle = sb.toString();  
	    String result = afterShuffle.substring(5, 9);  
	    return result;
	}
	
	/**
	 * @Description:  获取一个6位数字的验证码
	 * @param @return
	 * @return String
	 * @throws
	 */
	public static String getSixnumRandomCode(){
		String[] beforeShuffle = new String[] { "0", "1", "2", "3", "4", "5", "6", "7",  
                "8", "9" };  
	    List list = Arrays.asList(beforeShuffle);  
	    Collections.shuffle(list);  
	    StringBuilder sb = new StringBuilder();  
	    for (int i = 0; i < list.size(); i++) {  
	        sb.append(list.get(i));  
	    }  
	    String afterShuffle = sb.toString();  
	    String result = afterShuffle.substring(3, 9);  
	    return result;
	}
	
	/**
	 * @Description:  获取一个6位数字的验证码
	 * @param @return
	 * @return String
	 * @throws
	 */
	public static String getThreenumRandomCode(){
		String[] beforeShuffle = new String[] { "0", "1", "2", "3", "4", "5", "6", "7",  
                "8", "9" };  
	    List list = Arrays.asList(beforeShuffle);  
	    Collections.shuffle(list);  
	    StringBuilder sb = new StringBuilder();  
	    for (int i = 0; i < list.size(); i++) {  
	        sb.append(list.get(i));  
	    }  
	    String afterShuffle = sb.toString();  
	    String result = afterShuffle.substring(6, 9);  
	    return result;
	}
	
	/**
	 * @Description: 获取key值 
	 * @param @param pileId
	 * @param @param userId
	 * @param @return
	 * @return String
	 * @throws
	 */
	public static String getKey(String pileId,String userId){
		StringBuffer key = new StringBuffer();
		key.append(pileId);
		key.append(userId);
		key.append(UUIDGenerator.generateShortUuid());
		return key.toString();
	}
	
	
	
}
