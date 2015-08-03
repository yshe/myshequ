package com.community.common.picTool;

public class PicTool {

	final static long SCALE = (long) 0.5;
	final static int SAMLL_HEIGHT = 100;
	//final static String SMALL_FILE = "thumbnail";

	public static boolean picSmall(String basePath, String fileName) {
		String smallPath = "";
		String bigPath = "";
		JpegTool j = new JpegTool();
		String[] imgs = fileName.split(",");
		try {
			j.SetScale(0.5);
			j.SetSmallHeight(100);
			for (String img : imgs) {
				bigPath = basePath + "/" + img;
				smallPath = basePath + "/" + PicProperty.SMALL_FILE + "/" + img;
				j.doFinal(bigPath, smallPath);
				System.out.println(smallPath);
			}

		} catch (JpegToolException e) {
			e.printStackTrace();
			System.out.println("生成缩略图出现问题啦！！！！！！！！！");

		}

		return false;
	}

	public static void picSmalls(String basePath, String fileName) {
		String smallPath = "";
		String bigPath = "";
		JpegTool j = new JpegTool();

		try {
			j.SetScale(1);
			j.SetSmallHeight(500);

			bigPath = basePath +fileName;
			smallPath = basePath + PicProperty.SMALL_FILE + "\\" + fileName;
			j.doFinal(bigPath, smallPath);
			System.out.println(smallPath);
		} catch (JpegToolException e) {
			e.printStackTrace();
			System.out.println("生成缩略图出现问题啦！！！！！！！！！");

		}

		
	}

}
