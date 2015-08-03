package com.community.util;

import java.io.File;

import org.apache.log4j.Logger;

import com.community.common.picTool.PicProperty;


public class DeleteImg {

	Logger logger = Logger.getLogger(DeleteImg.class);

	public static void deleteImg(String basePath, String imgfile) {
		String pathString = "";
		pathString = basePath +imgfile;
		try {
			File file = new File(pathString);
			file.delete();
			try {
				pathString = basePath +  PicProperty.getSmallFile() + "\\"
						+ imgfile;
				file = new File(pathString);
				file.delete();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} catch (Exception e) {
			// System.out.println(e);
			e.printStackTrace();

		}

	}

	public static void deleteImgList(String basePath, String[] imgs) {
		String pathString = "";
		for (String img : imgs) {
			pathString = basePath +  img;

			try {
				File file = new File(pathString);
				file.delete();
				try {
					pathString = basePath  + PicProperty.getSmallFile()
							+ "\\" + img;
					file = new File(pathString);
					file.delete();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			} catch (Exception e) {
				System.out.println("删除图片列表失败" + e);
			}

		}
	}

}
