package com.community.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadUits {
	public boolean saveFile(HttpServletRequest request,
			HttpServletResponse response, String folderName,
			UploadAfterGetJsonStringListener listener) throws IOException {
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		String filepath = request.getSession().getServletContext()
				.getRealPath("/" + folderName + "/")
				+ "/";
		if (isMultipart) {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			String path = request.getSession().getServletContext()
					.getRealPath("/upload");
			File Path = new File(path);
			if (!Path.exists()) {
				Path.mkdirs();
			}
			factory.setRepository(Path);
			factory.setSizeThreshold(1024 * 1024 * 5);
			ServletFileUpload upload = new ServletFileUpload(factory);
			try {
				List<FileItem> fileItems = upload.parseRequest(request);
				for (FileItem item : fileItems) {
					if (item.isFormField()) {
						String paramName = item.getFieldName();
						if (paramName.equals("data")) {
							// map.put("json", item.getString());
							if (listener != null) {
								listener.uploadAfterGetJsonStringListener(item
										.getString());
							}
						}
					} else {
						String newFileName = item.getName();
						InputStream input = item.getInputStream();
						OutputStream fos = new FileOutputStream(filepath
								+ newFileName);
						byte buffer[] = new byte[1024];
						int temp;
						while ((temp = input.read(buffer)) != -1) {
							fos.write(buffer, 0, temp);
						}
						fos.flush();
						fos.close();
						input.close();
					}
				}
				return true;
			} catch (FileUploadException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
