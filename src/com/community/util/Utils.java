package com.community.util;

import java.util.UUID;

public class Utils {
	//
	static public String getUUID() {
		UUID uuid = UUID.randomUUID();
		String ss = uuid.toString().replace("-", "");
		return ss;
	}
	
	static public String getCode() {
		return String.valueOf((int) (Math.random() * 99999 - 9999));
	}

}
