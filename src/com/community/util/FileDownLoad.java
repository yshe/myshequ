package com.community.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FileDownLoad {
	
	
	public static void main(String[] args) {
		String storeName="test.txt";
		    String contentType = "application/octet-stream";  
		    String downloadPath="http://192.168.1.107:8090/img/postImg/";
		   /* try {
				download(storeName, contentType,downloadPath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
	}

	 //文件下载 主要方法
	  public static void download(HttpServletRequest request,  
	      HttpServletResponse response, String storeName,String basePath
	       ) throws Exception {  
		  String contentType = "application/octet-stream";  
	    request.setCharacterEncoding("UTF-8");  
	    BufferedInputStream bis = null;  
	    BufferedOutputStream bos = null;  
	  
	    //获取项目根目录
	    /*String ctxPath = request.getSession().getServletContext()  
	        .getRealPath("/resource/img/"); */
	    //String ctxPath=SysProperty.APP_FILE_PATH_STRING;
	    
	    //获取下载文件路径
	    String downLoadPath =basePath+storeName;  
	  System.out.println(downLoadPath);
	  System.out.println(basePath);
	    //获取文件的长度
	    long fileLength = new File(downLoadPath).length();  

	    //设置文件输出类型
	    response.setContentType("application/octet-stream");  
	    response.setHeader("Content-disposition", "attachment; filename="  
	        + new String(storeName.getBytes("utf-8"), "ISO8859-1")); 
	    //设置输出长度
	    response.setHeader("Content-Length", String.valueOf(fileLength));  
	    //获取输入流
	    bis = new BufferedInputStream(new FileInputStream(downLoadPath));  
	    //输出流
	    bos = new BufferedOutputStream(response.getOutputStream());  
	    byte[] buff = new byte[2048];  
	    int bytesRead;  
	    while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {  
	      bos.write(buff, 0, bytesRead);  
	    }  
	    //关闭流
	    bis.close();  
	    bos.close();  
	  }

}
