package com.community.common.picTool;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

public class StreamPic {

	public static void outStreamThumbPic(File file, String bigpicPath)
			throws Exception {

		String thumbPath = bigpicPath + PicProperty.SMALL_FILE + "\\";
		try {
			BufferedImage bufferedImage;
			bufferedImage = ImageIO.read(file);
			BufferedImage bufferedImage1 = new BufferedImage(
					bufferedImage.getWidth()/2,
					bufferedImage.getHeight()/2, BufferedImage.TYPE_INT_BGR);

			Image image = bufferedImage.getScaledInstance(
					bufferedImage.getWidth()/2,
					bufferedImage.getHeight()/2,
					BufferedImage.SCALE_AREA_AVERAGING);
			// getScaledInstance得到一个一个100*100的Image对象
			bufferedImage1.getGraphics().drawImage(image, 0, 0, null);
			String end = file.getName().substring(
					file.getName().lastIndexOf(".") + 1);
			String fileName = thumbPath + file.getName();
			ImageIO.write(bufferedImage1, end, new File(fileName));// 把图片输出

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void outsStreamThumbPic(List<File> files, String bigPicPath) {
		String thumbPath = bigPicPath + PicProperty.SMALL_FILE + "\\";

		try {
			for (File file : files) {
				BufferedImage bufferedImage;
				bufferedImage = ImageIO.read(file);
				BufferedImage bufferedImage1 = new BufferedImage(
						bufferedImage.getWidth()/2,
						bufferedImage.getHeight()/2,
						BufferedImage.TYPE_INT_BGR);

				Image image = bufferedImage.getScaledInstance(
						bufferedImage.getWidth()/2,
						bufferedImage.getHeight()/2,
						BufferedImage.SCALE_AREA_AVERAGING);
				// getScaledInstance得到一个一个100*100的Image对象
				bufferedImage1.getGraphics().drawImage(image, 0, 0, null);
				String end = file.getName().substring(
						file.getName().lastIndexOf("."));
				ImageIO.write(bufferedImage1, end,
						new File(thumbPath + file.getName()));// 把图片输出
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
