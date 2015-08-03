/**
 * This file created at 2015年8月3日.
 *
 * Copyright (c) 2002-2015 Bingosoft, Inc. All rights reserved.
 */
package com.community.bean;

import java.util.Date;

/**
 * <code>{@link userInfo}</code>
 *用户个人信息
 * TODO : document me
 *
 * @author yabushan
 */
public class userInfo {
	
	private String uid;//用户Id
	private String nickname;//用户昵称
	private String realName;//真实姓名
	private int sex;//0女，1男；2，不详
	private String address;//住址
	private int userType;//用户类型：1.管理员，2.普通用户，3.房东
	private int userAuth;//用户权限
	private String idcard;//身份证号
	private String headImg;//头像
	private String phone;//手机号
	private String password;//密码
	private Date createTime;//注册时间
	private Date lastLogin;//最近最后一次登录时间
	private String  recommendImg;//推荐否
	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}
	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	/**
	 * @return the sex
	 */
	public int getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the userType
	 */
	public int getUserType() {
		return userType;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(int userType) {
		this.userType = userType;
	}
	/**
	 * @return the userAuth
	 */
	public int getUserAuth() {
		return userAuth;
	}
	/**
	 * @param userAuth the userAuth to set
	 */
	public void setUserAuth(int userAuth) {
		this.userAuth = userAuth;
	}
	/**
	 * @return the idcard
	 */
	public String getIdcard() {
		return idcard;
	}
	/**
	 * @param idcard the idcard to set
	 */
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	/**
	 * @return the headImg
	 */
	public String getHeadImg() {
		return headImg;
	}
	/**
	 * @param headImg the headImg to set
	 */
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the lastLogin
	 */
	public Date getLastLogin() {
		return lastLogin;
	}
	/**
	 * @param lastLogin the lastLogin to set
	 */
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	/**
	 * @return the recommendImg
	 */
	public String getRecommendImg() {
		return recommendImg;
	}
	/**
	 * @param recommendImg the recommendImg to set
	 */
	public void setRecommendImg(String recommendImg) {
		this.recommendImg = recommendImg;
	}
	
	
	
	

}
