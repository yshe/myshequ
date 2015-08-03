package com.community.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import redis.clients.jedis.Jedis;

/** 
 * @ClassName: VerificationUtil 
 * @Description: 验证码util
 * @author wzx
 * @date 2014年12月31日 下午3:11:44  
 */
public class VerificationUtil {
	
	private Logger logger = Logger.getLogger(VerificationUtil.class);
	
	/**
	 * @Description: 通过key到缓存中获取验证码 
	 * @param @param key
	 * @param @return
	 * @return String
	 * @throws
	 */
	public static String getVerifications(String key){
		Jedis redis = RedisInstance.getInstance();
		Map<String,String> maps = redis.hgetAll("verifications");
		String veri = maps.get(key);
		return veri;
	}
	
	/**
	 * @Description: 把验证码放到缓存中 
	 * @param @param key
	 * @param @param value
	 * @return void
	 * @throws
	 */
	public static void setVerifications(String key,String value){
		Jedis redis = RedisInstance.getInstance();
		Map<String,String> maps = redis.hgetAll("verifications");
		if(maps!=null && maps.size()>0){
			maps.put(key, value);
			redis.hmset("verifications", maps);
		}else{
			Map<String, String> verification = new HashMap<String, String>();
			verification.put(key, value);
			redis.hmset("verifications", verification); 
		}
	}
	
	/**
	 * @Description: 把六位数字验证码放到缓存中 
	 * @param @param key
	 * @param @param value
	 * @return void
	 * @throws
	 */
	public static void setNumVerifications(String key,String value){
		Jedis redis = RedisInstance.getInstance();
		Map<String,String> maps = redis.hgetAll("numverifications");
		if(maps!=null && maps.size()>0){
			maps.put(key, value);
			redis.hmset("numverifications", maps);
		}else{
			Map<String, String> verification = new HashMap<String, String>();
			verification.put(key, value);
			redis.hmset("numverifications", verification); 
		}
	}
	
	/**
	 * @Description: 通过key到缓存中获取六位验证码 
	 * @param @param key
	 * @param @return
	 * @return String
	 * @throws
	 */
	public static String getNumVerifications(String key){
		Jedis redis = RedisInstance.getInstance();
		Map<String,String> maps = redis.hgetAll("numverifications");
		String veri = maps.get(key);
		return veri;
	}
	
	/**
	 * @Description:  删除六位验证码
	 * @param @param key
	 * @return void
	 * @throws
	 */
	public static void delNumVerifications(String key){
		Jedis redis = RedisInstance.getInstance();
		Map<String,String> maps = redis.hgetAll("numverifications");
		maps.remove(key);
		if(maps.size()>0){
			redis.hmset("numverifications", maps);
		}else{
			maps.put("startnum", "startnum");
			redis.hmset("numverifications", maps);
		}
	}
	
	/**
	 * 判断六位验证码是否存在于redis数据库中或者是否过期
	 * @param token
	 * @return
	 */
	public static boolean isNumVerificationsOk(String phone,String checkcode) {
		boolean flag = false;
		Jedis  redis = RedisInstance.getInstance();
		Map<String,String> verifications = redis.hgetAll("numverifications"); 
		if (verifications.containsKey(phone)) {
			String str = verifications.get(phone);
			String[] codes = str.split(",");
			if(checkcode.equals(codes[0])){
				long time = System.currentTimeMillis()+1800000L;
				if(Long.valueOf(codes[1])<=time){
					flag = true;
				}
			}
		}else {
			flag = false;
		}
		return flag;
	}
	
	/**
	 * @Description:  删除验证码
	 * @param @param key
	 * @return void
	 * @throws
	 */
	public static void delVerifications(String key){
		Jedis redis = RedisInstance.getInstance();
		Map<String,String> maps = redis.hgetAll("verifications");
		maps.remove(key);
		if(maps.size()>0){
			redis.hmset("verifications", maps);
		}else{
			maps.put("start", "start");
			redis.hmset("verifications", maps);
		}
	}
	
	public static void main(String[] args) {
//		delVerifications("15975453045");
//		String str = VerificationUtil.getNumVerifications("15975453045");
//		System.out.println(str);
//		boolean flag = isNumVerificationsOk("15975453045","104365");
//		System.out.println(flag);
		for(int i=0;i<5;i++){
			String str = VerificationUtil.getNumVerifications("15975453045");
			String code = RandomUtil.getSixnumRandomCode();
			String verfication = code+","+System.currentTimeMillis();
			VerificationUtil.setNumVerifications("15975453045", verfication);
		}
	}
	
}
