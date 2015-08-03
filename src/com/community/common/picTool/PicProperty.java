package com.community.common.picTool;

/**
 * 文件保存地址
 * @author Administrator
 *
 */
public class PicProperty {
	//缩略图片保存地址
	final static String SMALL_FILE="thumbnail";
	
	final static int THUMB_PIC_WIDTH=150;
	final static int THUMB_PIC_HEIGHT=150;

	public static String getSmallFile() {
		return SMALL_FILE;
	}

	public static int getThumbPicWidth() {
		return THUMB_PIC_WIDTH;
	}

	public static int getThumbPicHeight() {
		return THUMB_PIC_HEIGHT;
	}
	
	

}
