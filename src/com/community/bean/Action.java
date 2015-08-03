/**
 * This file created at 2015年8月3日.
 *
 * Copyright (c) 2002-2015 Bingosoft, Inc. All rights reserved.
 */
package com.community.bean;

import java.util.Date;

/**
 * <code>{@link Action}</code>
 *活动实体类
 * TODO : document me
 *
 * @author yabushan
 */
public class Action {
	
	private int id;
	private String title;//活动主题
	private String img;//活动海报
	private String describle;//描述
	private Date startTime;//开始时间
	private Date endTime;//结束时间
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the img
	 */
	public String getImg() {
		return img;
	}
	/**
	 * @param img the img to set
	 */
	public void setImg(String img) {
		this.img = img;
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
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
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
	

}
