/**
 * This file created at 2015年7月20日.
 *
 * Copyright (c) 2002-2015 Bingosoft, Inc. All rights reserved.
 */
package com.community.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.community.bean.Humor;
import com.community.dao.XiaoHuaDao;
import com.community.service.XiaoHuaManager;


/**
 * <code>{@link XiaoHuaManagerImpl}</code>
 *
 * TODO : document me
 *
 * @author yabushan
 */
@Service("xiaoHuaManager")
public class XiaoHuaManagerImpl implements XiaoHuaManager {

	/* (non-Javadoc)
	 * @see com.tgb.manager.XiaoHuaManager#getOneHumor(java.lang.Integer)
	 */
	
	/*private XiaoHuaDao xiaoHuaDao;
	*//**
	 * @param xiaoHuaDao the xiaoHuaDao to set
	 *//*
	public void setXiaoHuaDao(XiaoHuaDao xiaoHuaDao) {
		this.xiaoHuaDao = xiaoHuaDao;
	}*/
	@Resource
	private XiaoHuaDao xiaoHuaDao;
	@Override
	public Humor getOneHumor(Integer id) {
		return xiaoHuaDao.getOneHumor(id);
	}

}
