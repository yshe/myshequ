/**
 * This file created at 2015年8月3日.
 *
 * Copyright (c) 2002-2015 Bingosoft, Inc. All rights reserved.
 */
package com.community.bean;

import java.util.Date;

/**
 * <code>{@link OldMarket}</code>
 *闲置物品出售市场实体类
 * TODO : document me
 *
 * @author yabushan
 */
public class OldMarket {
	
	private int id;
	private int uid;//发布人Id
	private String goodsName;//商品名
	private String describle;//描述
	private String goodsImg;//商品图片
	private float price;//价格
	private Date publishTime;//发布时间
	private Date endTime;//结束时间
	private int flag;//0:发布中，1：结束
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
	public int getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}
	/**
	 * @return the goodsName
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * @param goodsName the goodsName to set
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	/**
	 * @return the goodsImg
	 */
	public String getGoodsImg() {
		return goodsImg;
	}
	/**
	 * @param goodsImg the goodsImg to set
	 */
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
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
