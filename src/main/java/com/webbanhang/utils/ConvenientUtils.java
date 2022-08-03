package com.webbanhang.utils;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public interface ConvenientUtils {

	public String emailToStar(String star);
	public String ranDomCapCha();
	public File saveFile(MultipartFile file, String path);
	
}
