/**
 * This file created at 2015年7月20日.
 *
 * Copyright (c) 2002-2015 Bingosoft, Inc. All rights reserved.
 */
package com.community.controller.restful;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.community.bean.Humor;
import com.community.common.RestRspVO;
import com.community.service.XiaoHuaManager;


/**
 * <code>{@link XiaoHuaController}</code>
 *
 * TODO : document me
 *
 * @author yabushan
 */
@RestController
public class XiaoHuaController {

	@Autowired
	private XiaoHuaManager xiaoHuaManager;
	
	@RequestMapping(value="req/humor",method=RequestMethod.POST)
	public RestRspVO<Humor> returnoHumor(HttpServletRequest request,HttpServletResponse response) throws IOException{
		RestRspVO<Humor> result=new RestRspVO<Humor>();
		Integer id=Integer.parseInt(request.getParameter("id"));
		Humor humor=xiaoHuaManager.getOneHumor(id);
		result.setCode(1);
		result.setMessage("ok");
		result.setResult(humor);
		
		//PrintWriter out=response.getWriter();
		//out.println(JSON.toJSONString(result));
		return result;
	}

}
