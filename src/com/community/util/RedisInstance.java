package com.community.util;

import redis.clients.jedis.Jedis;

/**
 * redis单例类
 * @author USER
 *
 */
public class RedisInstance {
	private static Jedis redis = null;  
	   
    private RedisInstance() {  
       // Exists only to defeat instantiation.  
    }  
   
    public static Jedis getInstance() {  
       if (redis == null) {  
//    	   redis = new Jedis ("210.51.17.141",6379);//连接redis 
    	   redis = new Jedis ("127.0.0.1",6379);//连接redis 
       }  
       return redis;  
    }  
}
