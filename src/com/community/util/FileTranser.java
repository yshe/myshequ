package com.community.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.community.common.picTool.StreamPic;


public class FileTranser {
	
	
	public static boolean saveFielByFileName(MultipartFile files,String basePath,String filename){
		try {
			
			File file=new  File(basePath,filename);
			 files.transferTo(file);
			 try {
				 StreamPic.outStreamThumbPic(file, basePath);
				 
				// PicTool.picSmalls(realPath, files.getOriginalFilename());
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			 return true;
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	
		
		return false;
		
	}
	
	
	public static boolean saveFile(MultipartHttpServletRequest request,String realPath){
		
	 MultipartFile	files= request.getFile("file");
		
		if(files.getSize()!=0){
			try {
				File file=new  File(realPath,files.getOriginalFilename());
				 files.transferTo(file);
				 try {
					 StreamPic.outStreamThumbPic(file, realPath);
					 
					// PicTool.picSmalls(realPath, files.getOriginalFilename());
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
				 return true;
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return false;
}
	public static void  saveFiles(List<MultipartFile> files,String realPath){
		
		for(MultipartFile file:files){
			
			try {
				File file2=new File(realPath,file.getOriginalFilename());
				
				file.transferTo(file2);
				System.out.println("save pic success"+realPath+file.getOriginalFilename());
				try {
					StreamPic.outStreamThumbPic(file2, realPath);
					//PicTool.picSmalls(realPath, file.getOriginalFilename());
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("生成缩略图出错了！！！！"+e);
				}
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("保存图片出错了！！！"+e);
				
			}
		}
		}
	
	
}
