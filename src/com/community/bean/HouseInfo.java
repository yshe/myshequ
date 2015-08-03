/**
 * This file created at 2015年8月3日.
 *
 * Copyright (c) 2002-2015 Bingosoft, Inc. All rights reserved.
 */
package com.community.bean;

import java.util.Date;

/**
 * <code>{@link HouseInfo}</code>
 *房屋信息
 * TODO : document me
 *
 * @author yabushan
 */
public class HouseInfo {
	
	private int id;//Id
	private String uid;//房东Id
	private String address;//房屋地理位置
	private String describle;//房屋描述
	private String houseType;//房屋类型（几房几厅）
	private float price;//价格/月
	private String houseImg;//房屋照片
	private Date publishTime;//发布时间
	private int lessmonth;//最少要租几个月
	private String recommendImg;//推荐否
	private int flag;//房屋状态  0：出售中，1：已售出
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
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
	 * @return the describle
	 */
	public String getDescrible() {
		return describle;
	}
	/**
	 * @param describle the describle to set
	 */
	public void setDescrible(String describle) {
		this.describle = describle;
	}
	/**
	 * @return the houseType
	 */
	public String getHouseType() {
		return houseType;
	}
	/**
	 * @param houseType the houseType to set
	 */
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the houseImg
	 */
	public String getHouseImg() {
		return houseImg;
	}
	/**
	 * @param houseImg the houseImg to set
	 */
	public void setHouseImg(String houseImg) {
		this.houseImg = houseImg;
	}
	/**
	 * @return the publishTime
	 */
	public Date getPublishTime() {
		return publishTime;
	}
	/**
	 * @param publishTime the publishTime to set
	 */
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	/**
	 * @return the lessmonth
	 */
	public int getLessmonth() {
		return lessmonth;
	}
	/**
	 * @param lessmonth the lessmonth to set
	 */
	public void setLessmonth(int lessmonth) {
		this.lessmonth = lessmonth;
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
	/**
	 * @return the flag
	 */
	public int getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
}
