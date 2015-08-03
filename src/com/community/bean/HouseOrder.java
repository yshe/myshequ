/**
 * This file created at 2015年8月3日.
 *
 * Copyright (c) 2002-2015 Bingosoft, Inc. All rights reserved.
 */
package com.community.bean;

import java.util.Date;

/**
 * <code>{@link HouseOrder}</code>
 *已通过app平台出售记录
 * TODO : document me
 *
 * @author yabushan
 */
public class HouseOrder {
	
	private int id;
	private String userid;//租客Id
	private String ownerId;//房东Id
	private String userCard;//租客身份证
	private float price;//租售价格
	private float powprice;//电费
	private float waterprice;//水费
	private Date saleTime;//租售时间
	private Date endTime;//到期时间
	private int flag;//状态：0：正常，1：已到期
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
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * @return the ownerId
	 */
	public String getOwnerId() {
		return ownerId;
	}
	/**
	 * @param ownerId the ownerId to set
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	/**
	 * @return the userCard
	 */
	public String getUserCard() {
		return userCard;
	}
	/**
	 * @param userCard the userCard to set
	 */
	public void setUserCard(String userCard) {
		this.userCard = userCard;
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
	 * @return the powprice
	 */
	public float getPowprice() {
		return powprice;
	}
	/**
	 * @param powprice the powprice to set
	 */
	public void setPowprice(float powprice) {
		this.powprice = powprice;
	}
	/**
	 * @return the waterprice
	 */
	public float getWaterprice() {
		return waterprice;
	}
	/**
	 * @param waterprice the waterprice to set
	 */
	public void setWaterprice(float waterprice) {
		this.waterprice = waterprice;
	}
	/**
	 * @return the saleTime
	 */
	public Date getSaleTime() {
		return saleTime;
	}
	/**
	 * @param saleTime the saleTime to set
	 */
	public void setSaleTime(Date saleTime) {
		this.saleTime = saleTime;
	}
	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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
